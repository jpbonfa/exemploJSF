package br.com.treinamento.exemplojsf.dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.treinamento.exemplojsf.model.Cliente;

public class ClienteDAO {

	private Connection bd;

	public ClienteDAO(Connection bd) {
		this.bd = bd;
	}

	public void inserir(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO cliente (nome,logradouro,numero_logradouro,bairro,cidade,estado,telefone,cpf,rg,sexo,data_nascimento,idade) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement comando = (PreparedStatement) bd.prepareStatement(sql);
		comando.setString(1, cliente.getNome());
		comando.setString(2, cliente.getLougradouro());
		comando.setInt(3, cliente.getNumeroLogradouro());
		comando.setString(4, cliente.getBairro());
		comando.setString(5, cliente.getCidade());
		comando.setString(6, cliente.getEstado());
		comando.setString(7, cliente.getTelfone());
		comando.setString(8, cliente.getCpf());
		comando.setString(9, cliente.getRg());
		comando.setString(10, cliente.getSexo() + "");
		comando.setString(11, cliente.getDataNascimento());
		comando.setInt(12, cliente.getIdade());
				comando.execute();
	}
}
