package br.com.treinamento.exemplojsf.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.treinamento.exemplojsf.dao.ProdutoDAO;
import br.com.treinamento.exemplojsf.model.Produto;

public class TestaInserirProduto {

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.setNome("pipoca");
		produto.setQuantidade(2);
		produto.setValor(200.0);
		double valorTotal;
		valorTotal = produto.getQuantidade()* produto.getValor();
		produto.setValorTotal(valorTotal);

		Connection bd = ConnectionFactory.getConnection();

		ProdutoDAO dao = new ProdutoDAO(bd); 
		try {
			dao.inserir(produto);
			System.out.println("Produto salvo com sucesso");
		} catch (SQLException e) {
			System.out.println("Erro ao inserir produto");
			e.printStackTrace();
		}
	}

}
