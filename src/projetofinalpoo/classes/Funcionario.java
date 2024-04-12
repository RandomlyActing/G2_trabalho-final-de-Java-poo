package projetofinalpoo.classes;

public abstract class Funcionario extends Pessoa {

	private String cargo;
	public Funcionario(String nome, String cpf, String senha) {
		super(nome,cpf, senha);
		
	}
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
}
