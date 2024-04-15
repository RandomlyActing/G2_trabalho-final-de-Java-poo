package projeto.classes;

import projeto.enums.TipoContaEnum;
import projeto.enums.ValorMovimentacoes;
import projeto.exceptions.ContaException;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, String agencia, Gerente gerente) {
		super(cliente, agencia, gerente);
		this.tipo = TipoContaEnum.POUPANCA.name();
	}

	@Override
	public void saque(double valor) throws ContaException
	{
		if (valor > saldo || valor <= 0)
		{
			throw new ContaException("Saldo insuficiente para completar a operação.");
		}
		else
		{
		saldo = saldo - (valor + ValorMovimentacoes.SAQUE.getValorPorMovimentacao());
		//impressor.escrevaSaque(valor, cliente.getNome());
		}
		
	}

	@Override
	public void deposito(double valor) throws ContaException {
		
		if (valor <= 0)
		{
			throw new ContaException("Valor Indevido!");
		}
		else
		{
		saldo =  (saldo + valor) - ValorMovimentacoes.DEPOSITO.getValorPorMovimentacao();
		//impressor.escrevaDeposito(valor, cliente.getNome());
		}
		
	}

	@Override
	public void transferencia(Conta destino, double valor) throws ContaException {
		if (valor > saldo || valor <= 0)
		{
			throw new ContaException("Saldo insuficiente para completar a operação.");
		}
		else
		{
		subtrairSaldo(valor + ValorMovimentacoes.TRANSFERENCIA.getValorPorMovimentacao());
		destino.adicionarSaldo(valor);
		//impressor.escrevaTransFerencia(destino, valor, cliente.getNome());
		}
		
	}
	
	public void rendimentoPoupanca (double valor, int dias)
	{
		System.out.println("O rendimento de R$" + valor + " em " + dias + " dias será R$" + (valor + (valor * (dias * 0.001))));
	}
	
	public void adicionarSaldo (double valor)
	{
		this.saldo = this.saldo + valor; 
	}
	
	public void subtrairSaldo (double valor)
	{
		this.saldo = this.saldo - valor; 
	}
	
	public void mostrarSaldo() {
		System.out.println("O saldo da sua conta é R$" + this.getSaldo());
		
	}

}
