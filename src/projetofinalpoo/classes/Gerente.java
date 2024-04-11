package projetofinalpoo.classes;

import projetofinalpoo.enums.CargoEnum;

public final class Gerente extends Funcionario {

	public Gerente(String cpf, String senha) {
		super(cpf, senha);
		this.cargo = CargoEnum.GERENTE;
		
		
	}

	

}
