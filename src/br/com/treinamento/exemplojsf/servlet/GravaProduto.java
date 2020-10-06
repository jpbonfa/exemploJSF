package br.com.treinamento.exemplojsf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.com.treinamento.exemplojsf.dao.ProdutoDAO;
import br.com.treinamento.exemplojsf.model.Produto;
import br.com.treinamento.exemplojsf.util.ConnectionFactory;

public class GravaProduto extends HttpServlet {

	private static final long serialVersionUID = 1194444034679902022L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		System.out.println(req.getParameter("nome"));
//		System.out.println(req.getParameter("quantidade"));
//		System.out.println(req.getParameter("valor"));
//		System.out.println(req.getParameter("valor_total"));

		Connection bd = ConnectionFactory.getConnection();
		ProdutoDAO dao = new ProdutoDAO(bd);
		Produto produto = new Produto();

		produto.setNome(req.getParameter("nome"));
		produto.setQuantidade(Integer.parseInt(req.getParameter("quantidade")));
		String valor = req.getParameter("valor").replace("R$", "").replace(",", ".");
		produto.setValor(Double.parseDouble(valor));
		String valorTotal = req.getParameter("valor_total").replace("R$", "").replace(",", ".");
		produto.setValorTotal(Double.parseDouble(valorTotal));

		try {
			dao.inserir(produto);
			PrintWriter gravador = resp.getWriter();
			gravador.println("<html>");
			gravador.println("<head>");
			gravador.println("<title>Produto gravdo</title>");
			gravador.println("<script type=\"text/javascript\" src=\"js/navegacao.js\"></script>");
			gravador.println("</head>");
			gravador.println("<body>");
			gravador.println("<center>");
			gravador.println("<h1>Produto gravado com sucesso!!</h1>");
			gravador.println("Nome do produto: " + produto.getNome() + "<br/>");
			gravador.println("Quantidade de produtos: " + produto.getQuantidade() + "<br/>");
			gravador.println("Valor do produto: " + produto.getValor() + "<br/>");
			gravador.println("Valor total dos produtos: " + produto.getValorTotal() + "<br/>");
			gravador.println("<button type=\"button\" onclick=\"index()\">VOLTAR</button>");
			gravador.println("</center>");
			gravador.println("</body>");
			gravador.println("</html>");

		} catch (SQLException e) {
			System.out.println("erro ao gravar produto");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
