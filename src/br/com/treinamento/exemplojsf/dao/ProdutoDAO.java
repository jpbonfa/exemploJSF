package br.com.treinamento.exemplojsf.dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.treinamento.exemplojsf.model.Produto;

public class ProdutoDAO {

	private Connection bd;

	public ProdutoDAO(Connection bd) {
		this.bd = bd;
	}

	public void inserir(Produto produto) throws SQLException {
		String sql = "INSERT INTO produto (nome,quantidade,valor,valor_total) VALUES (?,?,?,?)";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		comando.setString(1, produto.getNome());
		comando.setInt(2, produto.getQuantidade());
		comando.setDouble(3, produto.getValor());
		comando.setDouble(4, produto.getValorTotal());
		comando.execute();
	}
}
