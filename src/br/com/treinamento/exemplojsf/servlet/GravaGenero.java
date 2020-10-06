package br.com.treinamento.exemplojsf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.com.treinamento.exemplojsf.dao.GeneroDAO;
import br.com.treinamento.exemplojsf.model.Genero;
import br.com.treinamento.exemplojsf.util.ConnectionFactory;

public class GravaGenero extends HttpServlet {

	private static final long serialVersionUID = -6248727628258909710L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("nome"));

		Connection bd = ConnectionFactory.getConnection();
		GeneroDAO dao = new GeneroDAO(bd);
		Genero genero = new Genero();

		genero.setNome(req.getParameter("nome"));

		try {
			dao.inserir(genero);
			PrintWriter gravador = resp.getWriter();
			gravador.println("<html>");
			gravador.println("<head>");
			gravador.println("<title>Genero gravdo</title>");
			gravador.println("<script type=\"text/javascript\" src=\"js/navegacao.js\"></script>");
			gravador.println("</head>");
			gravador.println("<body>");
			gravador.println("<center>");
			gravador.println("<h1>Genero gravado com sucesso!!</h1>");
			gravador.println("Nome do genero: " + genero.getNome() + "<br/>");
			gravador.println("<button type=\"button\" onclick=\"index()\">VOLTAR</button>");
			gravador.println("</center>");
			gravador.println("</body>");
			gravador.println("</html>");
		} catch (SQLException e) {
			System.out.println("erro ao gravar genero");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
