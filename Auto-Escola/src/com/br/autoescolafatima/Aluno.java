package com.br.autoescolafatima;

public class Aluno implements Cadastro {

	// Atributos de aluno
	public String cpf;
	public String nomeCompleto;
	public String telefonePrincipal;
	public String telefoneAlternativo;
	public String endereco;
	public String rg;
	public String cep;
	public String categoria;

	public Aluno(String cpf, String nomeCompleto, String telefonePrincipal, String telefoneAlternativo, String endereco,
			String rg, String cep, String categoria) {
		super();
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.telefonePrincipal = telefonePrincipal;
		this.telefoneAlternativo = telefoneAlternativo;
		this.endereco = endereco;
		this.rg = rg;
		this.cep = cep;
		this.categoria = categoria;
	}

	// Getters and Setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}

	public void setTelefonePrincipal(String telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}

	public String getTelefoneAlternativo() {
		return telefoneAlternativo;
	}

	public void setTelefoneAlternativo(String telefoneAlternativo) {
		this.telefoneAlternativo = telefoneAlternativo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public void cadastrarAluno() {
		String validaAluno = validaAluno();
		if (validaAluno == null) {
			// Acessa o banco e cadastra o Aluno
			System.out.println("Gravando dados de " + getNomeCompleto() + "...");
		} else {
			System.out.println(validaAluno);
		}
	}

	@Override
	public String validaAluno() {
		if (getNomeCompleto().trim().isEmpty()) {
			return "O nome deve ser preenchido.";
		} else if (getNomeCompleto().trim().length() < 5) {
			return "Nome curto demais.";
		} else if (getCpf().trim().length() != 11) {
			return "CPF inválido ou nulo.";
		}

		return null;
	}

}
