package projetofinalpoo.classes;

import projetofinalpoo.exceptions.ContaException;

public abstract class Conta {

	protected Cliente cliente;
	protected double saldo = 0.00;
	protected String agencia;
	protected Gerente gerente;
	
	
	public Conta(Cliente cliente, String agencia, Gerente gerente) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.gerente = gerente;
		
	}


	public Gerente getGerente() {
		return gerente;
	}


	public void setGerente(Gerente gerente) {
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
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void mostrarSaldo();
	public abstract void adicionarSaldo (double valor);
	public abstract void subtrairSaldo (double valor);
	public abstract void saque(double valor) throws ContaException;
    public abstract void deposito(double valor) throws ContaException;
    public abstract void transferencia(Conta destino, double valor) throws ContaException;
	
}
