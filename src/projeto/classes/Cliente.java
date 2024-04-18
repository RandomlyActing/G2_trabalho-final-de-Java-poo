package projeto.classes;

import projeto.enums.CargosEnum;

public final class Cliente extends Pessoa {
	 private int tipo;
	 
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Cliente(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.cargo = CargosEnum.CLIENTE.name();
	}
	
}
