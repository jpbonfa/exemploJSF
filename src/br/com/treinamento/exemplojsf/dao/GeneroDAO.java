package br.com.treinamento.exemplojsf.dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.treinamento.exemplojsf.model.Genero;

public class GeneroDAO {

	private Connection bd;

	public GeneroDAO(Connection bd) {
		this.bd = bd;
	}

	public void inserir(Genero genero) throws SQLException {
		String sql = "INSERT INTO genero (nome) VALUES (?)";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		comando.setString(1, genero.getNome());
		comando.execute();
	}

}
