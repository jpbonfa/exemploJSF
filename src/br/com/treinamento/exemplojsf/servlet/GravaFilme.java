package br.com.treinamento.exemplojsf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.com.treinamento.exemplojsf.dao.FilmeDAO;
import br.com.treinamento.exemplojsf.model.Filme;
import br.com.treinamento.exemplojsf.util.ConnectionFactory;

public class GravaFilme extends HttpServlet{
	private static final long serialVersionUID = 8896383417927958977L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//		System.out.println(req.getParameter("codigo"));
//		System.out.println(req.getParameter("nome"));
//		System.out.println(req.getParameter("genero"));
//		System.out.println(req.getParameter("valor"));
//		System.out.println(req.getParameter("disponivel"));
//		System.out.println(req.getParameter("promocao"));
//		System.out.println(req.getParameter("valorPromocao"));

		Connection bd = ConnectionFactory.getConnection();
		FilmeDAO dao =  new FilmeDAO(bd);
		Filme filme = new Filme();
		
		filme.setCodigo(Integer.parseInt(req.getParameter("codigo")));
		filme.setNome(req.getParameter("nome"));
		filme.setGenero(req.getParameter("genero"));
		String valor = req.getParameter("valor").replace("R$", "").replace(",", ".");
		filme.setValor(Double.parseDouble(valor));
		filme.setDisponivel(req.getParameter("disponivel"));
		filme.setPromocao(req.getParameter("promocao"));	
		String valorPromocao = req.getParameter("valorPromocao").replace("R$", "").replace(",", ".");
		filme.setValorPromocao(Double.parseDouble(valorPromocao));
		
		try {
			dao.inserir(filme);
			
			PrintWriter gravador = resp.getWriter();
			gravador.println("<html>");
			gravador.println("<head>");
			gravador.println("<title>Filme gravdo</title>");
			gravador.println("<script type=\"text/javascript\" src=\"js/navegacao.js\"></script>");
			gravador.println("</head>");
			gravador.println("<body>");
			gravador.println("<center>");
			gravador.println("<h1>Filme gravado com sucesso!!</h1>");
			gravador.println("Codigo do filme: " + filme.getCodigo()+"<br/>");
			gravador.println("Nome do filme: " + filme.getNome()+"<br/>");
			gravador.println("Genero do filme: " + filme.getGenero()+"<br/>");
			gravador.println("Valor do filme: " + filme.getValor()+"<br/>");
			gravador.println("Disponivel: " + filme.getDisponivel()+"<br/>");
			gravador.println("Promoção: " + filme.getPromocao()+"<br/>");
			gravador.println("Valor promoção: " + filme.getValorPromocao()+"<br/>");
			gravador.println("<button type=\"button\" onclick=\"index()\">VOLTAR</button>");
			gravador.println("</center>");
			gravador.println("</body>");
			gravador.println("</html>");
			
		} catch (SQLException e) {
			System.out.println("erro ao gravar filme");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

}
