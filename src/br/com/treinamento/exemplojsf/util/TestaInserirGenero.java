package br.com.treinamento.exemplojsf.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.treinamento.exemplojsf.dao.GeneroDAO;
import br.com.treinamento.exemplojsf.model.Genero;

public class TestaInserirGenero {

	public static void main(String[] args) {

		Genero genero = new Genero();
		genero.setNome("comedia");

		Connection bd = ConnectionFactory.getConnection();

		GeneroDAO dao = new GeneroDAO(bd);
		try {
			dao.inserir(genero);
			System.out.println("Genero salvo com sucesso");
		} catch (SQLException e) {
			System.out.println("Erro ao inserir genero");
			e.printStackTrace();
		}
	}

}
