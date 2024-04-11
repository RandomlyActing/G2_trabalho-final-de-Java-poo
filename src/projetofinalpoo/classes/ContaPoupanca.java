package projetofinalpoo.classes;

import projetofinalpoo.enums.TipoContaEnum;

public class ContaPoupanca extends Conta {
	
	private TipoContaEnum tipo = TipoContaEnum.POUPANCA;

	public ContaPoupanca(String cpfTitular, String agencia) {
		super(cpfTitular, agencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saque(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferencia(Conta destino, double valor) {
		// TODO Auto-generated method stub
		
	}

}
