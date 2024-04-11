package projetofinalpoo.classes;

import projetofinalpoo.enums.CargoEnum;

public final class Presidente extends Funcionario {

	public Presidente(String cpf, String senha) {
		super(cpf, senha);
		this.cargo = CargoEnum.PRESIDENTE;
	}

	

}
