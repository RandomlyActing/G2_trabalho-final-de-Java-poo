package projetofinalpoo.classes;

public class Gerente extends Funcionario {

	private String agencia;
	public Gerente(String cpf, String senha) {
		super(cpf, senha);
		this.setCargo("GERENTE");
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	
	
	

}
