package projeto.interfaces;

import projeto.classes.Conta;
import projeto.exceptions.ContaException;

public interface Transacao {
	
	public abstract void saque (double valor) throws ContaException;
	public abstract void deposito (double valor) throws ContaException;
	public abstract void transferencia(Conta destino, double valor) throws ContaException;

}
