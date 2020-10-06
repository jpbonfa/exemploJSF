package br.com.treinamento.exemplojsf.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * Classe responsavel por testar a conexao com o banco de dados
 * 
 * @author joaop
 * @since 16/06/2020
 */
public class TestaBanco {

	public static void main(String[] args) {
		String drive = "com.mysql.jdbc.Driver";
		String local = "jdbc:mysql://localhost/locadora_jsf";
		String login = "root";
		String senha = "root";

		Connection bd = null;

		try {
			Class.forName(drive);
			System.out.println("drive carregado com sucesso");
			bd = (Connection) DriverManager.getConnection(local,login,senha);
			System.out.println("conexao efetuada com sucesso");
			bd.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar o drive");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Erro ao efetuar conexao");
			e.printStackTrace();
		}

	}

}
