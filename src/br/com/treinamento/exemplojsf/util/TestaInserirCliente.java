package br.com.treinamento.exemplojsf.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.treinamento.exemplojsf.dao.ClienteDAO;
import br.com.treinamento.exemplojsf.model.Cliente;

public class TestaInserirCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("joao");
		cliente.setLougradouro("rua dr manoel de paiva ramos");
		cliente.setNumeroLogradouro(55);
		cliente.setBairro("limao");
		cliente.setCidade("Sao paulo");
		cliente.setEstado("SP");
		cliente.setTelfone("(11)987110-0380");
		cliente.setCpf("445.723.058/89");
		cliente.setRg("38.807.754-9");
		cliente.setSexo('H');
		cliente.setDataNascimento("08/08/2000");
		cliente.setIdade(20);

		Connection bd = ConnectionFactory.getConnection();

		ClienteDAO dao = new ClienteDAO(bd);
		try {
			dao.inserir(cliente);
			System.out.println("Cliente salvo com sucesso");
		} catch (SQLException e) {
			System.out.println("Erro ao inserir cliente");
			e.printStackTrace();
		}
	}
}
