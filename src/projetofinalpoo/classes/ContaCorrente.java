package projetofinalpoo.classes;

import projetofinalpoo.enums.TipoContaEnum;

public class ContaCorrente extends Conta {
	
	private TipoContaEnum tipo = TipoContaEnum.CORRENTE;
	
	public ContaCorrente(String cpfTitular, String agencia) {
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
