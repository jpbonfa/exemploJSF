package br.com.treinamento.exemplojsf.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionFactory {

	public static Connection getConnection() {

		final String drive = "com.mysql.jdbc.Driver";
		final String local = "jdbc:mysql://localhost/locadora_jsf";
		final String login = "root";
		final String senha = "root";

		Connection conexao = null;

		try {
			Class.forName(drive);
			conexao = (Connection) DriverManager.getConnection(local, login, senha);
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar o drive");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Erro ao efetuar conexao");
			e.printStackTrace();
		}
		
		return conexao;
	}

}
