package br.com.treinamento.exemplojsf.dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.treinamento.exemplojsf.model.Vendedor;

public class VendedorDAO {

	private Connection bd;

	public VendedorDAO(Connection bd) {
		this.bd = bd;
	}

	public void inserir(Vendedor vendedor) throws SQLException {
		String sql = "INSERT INTO vendedor (nome,area_venda,cidade,estado,sexo,idade,salario) VALUES (?,?,?,?,?,?,?)";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		comando.setString(1, vendedor.getNome());
		comando.setString(2, vendedor.getAreaVenda());
		comando.setString(3, vendedor.getCidade());
		comando.setString(4, vendedor.getEstado());
		comando.setString(5, vendedor.getSexo() + "");
		comando.setInt(6, vendedor.getIdade());
		comando.setDouble(7, vendedor.getSalario());
		comando.execute();
	}

}
