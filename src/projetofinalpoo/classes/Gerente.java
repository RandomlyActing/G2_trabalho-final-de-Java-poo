package projetofinalpoo.classes;

public class Gerente extends Funcionario {

	private String agencia;
	public Gerente(String nome,String cpf, String senha) {
		super(nome, cpf, senha);
		this.setCargo("GERENTE");
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	
	
	

}
