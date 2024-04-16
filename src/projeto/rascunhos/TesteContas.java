package projeto.rascunhos;

import projeto.classes.Cliente;
import projeto.classes.ContaCorrente;
import projeto.classes.Gerente;
import projeto.exceptions.ContaException;

public class TesteContas {
	
	public static void main(String[] args)
	{
		
		Cliente cli1 = new Cliente("Adalberto", "111111111-11", "123456" );
		Cliente cli2 = new Cliente("Joana", "222222222-22", "123456");
		Gerente ger = new Gerente("Mariano","333333333-33", "123456", "2885");
		
		ContaCorrente c1 = new ContaCorrente(cli2, "2885", ger);
		ContaCorrente c2 = new ContaCorrente(cli1, "2885", ger);
		
		
		c1.adicionarSaldo(1000);
		c2.adicionarSaldo(1000);
		
		System.out.println("Saldo de C1: " + c1.getSaldo());
		System.out.println("Saldo de C2: " + c2.getSaldo());
		
		try {
			c1.saque(100);
			c1.deposito(200);
			c2.transferencia(c1, 400);
			
			c1.mostrarSaldo();
			c2.mostrarSaldo();
		} catch (ContaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
