package projetofinalpoo.classes;

import projetofinalpoo.exceptions.ContaException;

public class TesteContaCorrente {
	
	public static void main(String[] args)
	{
	Gerente ger = new Gerente("Adalberto","333333", "567895");
	Cliente cli1 = new Cliente("Vicente","11111111","123456");
	Cliente cli2 = new Cliente("Fernando", "22222222", "234567");
	ContaPoupanca c1 = new ContaPoupanca(cli1,"2885", ger);
	ContaPoupanca c2 = new ContaPoupanca(cli2, "2885", ger);
	
	c1.setSaldo(1000);
	c2.setSaldo(1000);
	
	System.out.println("saldo da conta C1:" + c1.getSaldo());
	System.out.println("saldo da conta C2:" + c2.getSaldo());
	
	try {
		c2.saque(300);
		c1.transferencia(c2 ,150);
		c1.deposito(600);
	} catch (ContaException e) {
		System.out.println(e.getLocalizedMessage());
	}
	
	
	System.out.println("saldo da conta C1:" + c1.getSaldo());
	System.out.println("saldo da conta C2:" + c2.getSaldo());
	
	c2.rendimentoPoupanca(1000.0, 30);
	c1.mostrarSaldo();
	}
	
	

}
