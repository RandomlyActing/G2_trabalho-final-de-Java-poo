package projetofinalpoo.classes;

import projetofinalpoo.enums.CargoEnum;

public abstract class Funcionario extends Pessoa {
	
	protected CargoEnum cargo;

	public Funcionario(String cpf, String senha) {
		super(cpf, senha);
		
	}

	

}
