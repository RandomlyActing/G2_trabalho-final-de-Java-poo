package projetofinalpoo.classes;

public abstract class Pessoa {
	
	protected String cpf;
	protected String senha;
	
//construtor	
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
	
	

}
