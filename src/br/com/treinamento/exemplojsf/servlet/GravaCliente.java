package br.com.treinamento.exemplojsf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.com.treinamento.exemplojsf.dao.ClienteDAO;
import br.com.treinamento.exemplojsf.dao.VendedorDAO;
import br.com.treinamento.exemplojsf.model.Cliente;
import br.com.treinamento.exemplojsf.model.Vendedor;
import br.com.treinamento.exemplojsf.util.ConnectionFactory;

public class GravaCliente extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

		System.out.println(req.getParameter("nome"));
		System.out.println(req.getParameter("logradouro"));
		System.out.println(req.getParameter("numero"));
		System.out.println(req.getParameter("bairro"));
		System.out.println(req.getParameter("cidade"));
		System.out.println(req.getParameter("uf"));
		System.out.println(req.getParameter("telefone"));
		System.out.println(req.getParameter("cpf"));
		System.out.println(req.getParameter("rg"));
		System.out.println(req.getParameter("sexo"));
		System.out.println(req.getParameter("dataNascimento"));
		System.out.println(req.getParameter("idade"));

		Connection bd = ConnectionFactory.getConnection();
		ClienteDAO dao = new ClienteDAO(bd);
		Cliente cliente = new Cliente();

		cliente.setNome(req.getParameter("nome"));
		cliente.setLougradouro(req.getParameter("logradouro"));
		int numero = Integer.parseInt(req.getParameter("numero"));
		cliente.setNumeroLogradouro(numero);
		cliente.setBairro(req.getParameter("bairro"));
		cliente.setCidade(req.getParameter("cidade"));
		cliente.setEstado(req.getParameter("uf"));
		cliente.setCpf(req.getParameter("cpf"));
		cliente.setRg(req.getParameter("rg"));
		cliente.setSexo(req.getParameter("sexo").charAt(0));
		cliente.setDataNascimento(req.getParameter("dataNascimento"));
		cliente.setIdade(Integer.parseInt(req.getParameter("idade")));

		try {
			dao.inserir(cliente);
			PrintWriter gravador = resp.getWriter();
			gravador.println("<html>");
			gravador.println("<head>");
			gravador.println("<title>Vendedor gravdo</title>");
			gravador.println("<script type=\"text/javascript\" src=\"js/navegacao.js\"></script>");
			gravador.println("</head>");
			gravador.println("<body>");
			gravador.println("<center>");
			gravador.println("<h1>Cliente gravado com sucesso!!</h1>");
			gravador.println("Nome do cliente: " + cliente.getNome() + "<br/>");
			gravador.println("Logradouro: " + cliente.getLougradouro() + "<br/>");
			gravador.println("Numero: " + cliente.getNumeroLogradouro() + "<br/>");
			gravador.println("Bairro: " + cliente.getBairro() + "<br/>");
			gravador.println("Cidade do cliente: " + cliente.getCidade() + "<br/>");
			gravador.println("Estado do cliente: " + cliente.getEstado() + "<br/>");
			gravador.println("CPF: " + cliente.getCpf() + "<br/>");
			gravador.println("RG: " + cliente.getRg() + "<br/>");
			gravador.println("Sexo do cliente: " + cliente.getSexo() + "<br/>");
			gravador.println("Data de nascimento: " + cliente.getDataNascimento() + "<br/>");
			gravador.println("Idade: " + cliente.getIdade() + "<br/>");
			gravador.println("<button type=\"button\" onclick=\"index()\">VOLTAR</button>");
			gravador.println("</Center>");
			gravador.println("</body>");
			gravador.println("</html>");
		} catch (SQLException e) {
			System.out.println("erro ao gravar cliente");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
