package projetofinalpoo.classes;

import projetofinalpoo.enums.ValorMovimentacoes;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, String agencia, Gerente gerente) {
		super(cliente, agencia, gerente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void adicionarSaldo (double valor)
	{
		this.saldo = this.saldo + valor; 
	}

	@Override
	public void subtrairSaldo (double valor)
	{
		this.saldo = this.saldo - valor; 
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
	
	public void rendimentoPoupanca (double valor , int dias)
	{
		System.out.println("O rendimento de R$" + valor + " em " + dias + " dias será R$" + (valor + (valor * (dias * 0.001))));
	}

}
