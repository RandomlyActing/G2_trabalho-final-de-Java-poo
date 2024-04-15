package projeto.classes;

import projeto.enums.CargosEnum;

public class Presidente extends Funcionario {

	public Presidente(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.cargo = CargosEnum.PRESIDENTE.name();
		
	}

}
