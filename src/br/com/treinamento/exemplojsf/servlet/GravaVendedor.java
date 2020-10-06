package br.com.treinamento.exemplojsf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.com.treinamento.exemplojsf.dao.VendedorDAO;
import br.com.treinamento.exemplojsf.model.Vendedor;
import br.com.treinamento.exemplojsf.util.ConnectionFactory;

public class GravaVendedor extends HttpServlet {
	private static final long serialVersionUID = 7691234110103022246L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//		System.out.println(req.getParameter("nome"));
//		System.out.println(req.getParameter("areaVenda"));
//		System.out.println(req.getParameter("cidade"));
//		System.out.println(req.getParameter("uf"));
//		System.out.println(req.getParameter("sexo"));
//		System.out.println(req.getParameter("idade"));
//		System.out.println(req.getParameter("salario"));

		Connection bd = ConnectionFactory.getConnection();
		VendedorDAO dao = new VendedorDAO(bd);
		Vendedor vendedor = new Vendedor();

		vendedor.setNome(req.getParameter("nome"));
		vendedor.setAreaVenda(req.getParameter("areaVenda"));
		vendedor.setCidade(req.getParameter("cidade"));
		vendedor.setEstado(req.getParameter("uf"));
		vendedor.setSexo(req.getParameter("sexo").charAt(0));
		vendedor.setIdade(Integer.parseInt(req.getParameter("idade")));
		String salario = req.getParameter("salario").replace("R$", "").replace(",", ".");
		vendedor.setSalario(Double.parseDouble(salario));

		try {
			dao.inserir(vendedor);
			PrintWriter gravador = resp.getWriter();
			gravador.println("<html>");
			gravador.println("<head>");
			gravador.println("<title>Vendedor gravdo</title>");
			gravador.println("<script type=\"text/javascript\" src=\"js/navegacao.js\"></script>");
			gravador.println("</head>");
			gravador.println("<body>");
			gravador.println("<center>");
			gravador.println("<h1>Vendedor gravado com sucesso!!</h1>");
			gravador.println("Nome do vendedor: " + vendedor.getNome() + "<br/>");
			gravador.println("Area de venda: " + vendedor.getAreaVenda() + "<br/>");
			gravador.println("Cidade do vendedor: " + vendedor.getCidade() + "<br/>");
			gravador.println("Estado do vendedor: " + vendedor.getEstado() + "<br/>");
			gravador.println("Sexo do vendedor: " + vendedor.getSexo() + "<br/>");
			gravador.println("Idade: " + vendedor.getIdade() + "<br/>");
			gravador.println("Salario: " + vendedor.getSalario() + "<br/>");
			gravador.println("<button type=\"button\" onclick=\"index()\">VOLTAR</button>");
			gravador.println("</center>");
			gravador.println("</body>");
			gravador.println("</html>");
		} catch (SQLException e) {
			System.out.println("erro ao gravar vendedor");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
