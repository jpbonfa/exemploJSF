package br.com.treinamento.exemplojsf.model;

public class Produto {

	String nome;
	int quantidade;
	double valor;
	double valorTotal;

	public Produto() {

	}

	public Produto(String nome, int quantidade, double valor, double valorTotal) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.valorTotal = valorTotal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
