package br.com.treinamento.exemplojsf.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.treinamento.exemplojsf.dao.VendedorDAO;
import br.com.treinamento.exemplojsf.model.Vendedor;

public class TestaInserirVendedor {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("jeferson");
		vendedor.setAreaVenda("balcao");
		vendedor.setCidade("São Paulo");
		vendedor.setEstado("SP");
		vendedor.setSexo('M');
		vendedor.setIdade(21);
		vendedor.setSalario(1200.20);

		Connection bd = ConnectionFactory.getConnection();

		VendedorDAO dao = new VendedorDAO(bd);
		try {
			dao.inserir(vendedor);
			System.out.println("vendedor salvo com sucesso");
		} catch (SQLException e) {
			System.out.println("erro ao inserir vendedor");
			e.printStackTrace();
		}
	}
}
