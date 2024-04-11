package projetofinalpoo.classes;

public abstract class Pessoa {
	
	protected String cpf, senha;

	public Pessoa(String cpf, String senha) {
		this.cpf = cpf;
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	

}
