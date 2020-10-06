package br.com.treinamento.exemplojsf.model;

public class Filme {

	private int codigo;
	private String nome;
	private String genero;
	private double valor;
	private String disponivel;
	private String promocao;
	private double valorPromocao;

	public Filme() {

	}

	public Filme(int codigo, String nome, String genero, double valor, String disponivel, String promocao,
			double valorPromocao) {

		this.codigo = codigo;
		this.nome = nome;
		this.genero = genero;
		this.valor = valor;
		this.disponivel = disponivel;
		this.promocao = promocao;
		this.valorPromocao = valorPromocao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}

	public String getPromocao() {
		return promocao;
	}

	public void setPromocao(String promocao) {
		this.promocao = promocao;
	}

	public double getValorPromocao() {
		return valorPromocao;
	}

	public void setValorPromocao(double valorPromocao) {
		this.valorPromocao = valorPromocao;
	}

}
