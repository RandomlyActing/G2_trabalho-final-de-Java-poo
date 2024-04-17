package projeto.classes;

import projeto.enums.CargosEnum;

public final class Cliente extends Pessoa {
	
	public Cliente(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.cargo = CargosEnum.CLIENTE.name();
	}
	
	

	
}
