package br.com.treinamento.exemplojsf.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.treinamento.exemplojsf.dao.FilmeDAO;
import br.com.treinamento.exemplojsf.model.Filme;

public class TesteInserirFilme {
	
	
	public static void main(String[] args) {
		Filme filme = new Filme();
		filme.setCodigo(1);
		filme.setNome("filme1");
		filme.setGenero("ação");
		filme.setValor(120.0);
		filme.setDisponivel("S");
		filme.setPromocao("N");
		filme.setValorPromocao(100.0);
		
		Connection bd = ConnectionFactory.getConnection();
		
		FilmeDAO dao = new FilmeDAO(bd);
		try {
			dao.inserir(filme);
			System.out.println("filme salvo com sucesso");
		} catch (SQLException e) {
			System.out.println("erro ao inserir filme");
			e.printStackTrace();
		}
	}

}
