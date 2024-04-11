package projetofinalpoo.classes;

public abstract class Conta {
	
	private String cpfTitular;
	private double saldo;
	private String agencia;

//construtor
	public Conta(String cpfTitular, String agencia) {
		this.cpfTitular = cpfTitular;
		this.saldo = 0.0;
		this.agencia = agencia;
	}
	
//getters e setters
	public String getCpfTitular() {
		return cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
//metodos
	public abstract void saque(double valor);
    public abstract void deposito(double valor);
    public abstract void transferencia(Conta destino, double valor);

	
	

}
