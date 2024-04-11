package projetofinalpoo.classes;

import projetofinalpoo.enums.CargoEnum;

public final class Diretor extends Funcionario {

	public Diretor(String cpf, String senha) {
		super(cpf, senha);
		this.cargo = CargoEnum.DIRETOR;
	}

	

}
