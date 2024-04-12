package projetofinalpoo.classes;

import projetofinalpoo.enums.ValorMovimentacoes;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, String agencia, Gerente gerente) {
		super(cliente, agencia, gerente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saque(double valor) {
		saldo = saldo - (valor + ValorMovimentacoes.SAQUE.getValorPorMovimentacao());

	}

	@Override
	public void deposito(double valor) {
		saldo =  (saldo + valor) - ValorMovimentacoes.DEPOSITO.getValorPorMovimentacao();

	}

	@Override
	public void transferencia(Conta destino, double valor) {
		subtrairSaldo(valor + ValorMovimentacoes.TRANSFERENCIA.getValorPorMovimentacao());
		destino.adicionarSaldo(valor);

	}

	public void adicionarSaldo (double valor)
	{
		this.saldo = this.saldo + valor; 
	}
	
	public void subtrairSaldo (double valor)
	{
		this.saldo = this.saldo - valor; 
	}

	@Override
	public void mostrarSaldo() {
		System.out.println("O saldo da sua conta é R$" + this.getSaldo());
		
	}
	
	
}
