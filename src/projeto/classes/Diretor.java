package projeto.classes;

import projeto.enums.CargosEnum;

public class Diretor extends Funcionario {

	public Diretor(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.cargo = CargosEnum.DIRETOR.name();
	}

}
