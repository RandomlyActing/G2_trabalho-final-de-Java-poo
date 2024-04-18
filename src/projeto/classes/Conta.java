package projeto.classes;

import projeto.interfaces.Transacao;

public abstract class Conta implements Transacao {
	
	protected Cliente cliente;
	protected double saldo = 0.00;
	protected String agencia;
	protected Gerente gerente;
	protected String tipo;
	protected double gastos;
	
	public Conta(Cliente cliente, String agencia, Gerente gerente) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.gerente = gerente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public String getTipo() {
		return tipo;
	}
	
	
	
	public double getGastos() {
		return gastos;
	}

	public void setGastos(double gastos) {
		this.gastos = gastos;
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
		//EscreverRelatorioMostrarSaldo.relatorio();
	}
}
