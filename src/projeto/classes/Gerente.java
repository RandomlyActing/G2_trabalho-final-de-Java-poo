package projeto.classes;

import projeto.enums.CargosEnum;

public class Gerente extends Funcionario {

	private String agencia;
	
	public Gerente(String nome, String cpf, String senha, String agencia) {
		super(nome, cpf, senha);
		this.cargo = CargosEnum.GERENTE.name();
		this.agencia = agencia;
	}
	
	

}
