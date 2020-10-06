package br.com.treinamento.exemplojsf.model;

public class Cliente {
	private String nome;
	private String lougradouro;
	private int numeroLogradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String telfone;
	private String cpf;
	private String rg;
	private char sexo;
	private String dataNascimento;
	private int idade;

	public Cliente() {
	}

	public Cliente(String nome, String lougradouro, int numeroLogradouro, String bairro, String cidade,
			String estado, String telfone, String cpf, String rg, char sexo, String dataNascimento, int idade) {

		this.nome = nome;
		this.lougradouro = lougradouro;
		this.numeroLogradouro = numeroLogradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.telfone = telfone;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLougradouro() {
		return lougradouro;
	}

	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;
	}

	public int getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(int numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelfone() {
		return telfone;
	}

	public void setTelfone(String telfone) {
		this.telfone = telfone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
