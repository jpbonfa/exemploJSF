package br.com.treinamento.exemplojsf.dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.treinamento.exemplojsf.model.Filme;

public class FilmeDAO {

	private Connection bd;

	public FilmeDAO(Connection bd) {
		this.bd = bd;
	}

	public void inserir(Filme filme) throws SQLException {
		String sql = "INSERT INTO filme (codigo,nome,genero,valor,disponivel,promocao,valor_promocao) VALUES (?,?,?,?,?,?,?)";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		comando.setInt(1, filme.getCodigo());
		comando.setString(2, filme.getNome());
		comando.setString(3, filme.getGenero());
		comando.setDouble(4, filme.getValor());
		comando.setString(5, filme.getDisponivel());
		comando.setString(6, filme.getPromocao());
		comando.setDouble(7, filme.getValorPromocao());
		comando.execute();
	}
}
