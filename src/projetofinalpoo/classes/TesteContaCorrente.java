package projetofinalpoo.classes;

public class TesteContaCorrente {
	
	public static void main(String[] args)
	{
	Gerente ger = new Gerente("333333", "567895");
	Cliente cli1 = new Cliente("11111111","123456");
	Cliente cli2 = new Cliente("22222222", "234567");
	ContaPoupanca c1 = new ContaPoupanca(cli1,"2885", ger);
	ContaPoupanca c2 = new ContaPoupanca(cli2, "2885", ger);
	
	c1.setSaldo(1000);
	c2.setSaldo(-1000);
	
	System.out.println("saldo da conta C1:" + c1.getSaldo());
	System.out.println("saldo da conta C2:" + c2.getSaldo());
	
	c1.transferencia(c2, 200);
	
	System.out.println("saldo da conta C1:" + c1.getSaldo());
	System.out.println("saldo da conta C2:" + c2.getSaldo());
	
	c2.rendimentoPoupanca(1000.0, 40);
	c1.mostrarSaldo();
	}
	public class Teste {
	    public static void main(String[] args) {
	    	Cliente cliente = new Cliente("João", "12345678900");
	        Gerente gerente = new Gerente("Maria", "98765432100");
	        String agencia = "001";


	        ContaCorrente contaCorrente = new ContaCorrente(cliente, agencia, gerente);


	        testarValoresNegativos(contaCorrente);
	    }

	    public static void testarValoresNegativos(ContaCorrente contaCorrente) {
	 
	        double valorSaqueNegativo = -100;
	        contaCorrente.saque(valorSaqueNegativo); 

	    
	        double valorDepositoNegativo = -50;
	        contaCorrente.deposito(valorDepositoNegativo); 
	        
	        double valorTransferenciaNegativo = -200;
	        
	        ContaCorrente outraContaCorrente = new ContaCorrente(new Cliente("Ana", "98765432101"), "002", contaCorrente.getGerente());
	        contaCorrente.transferencia(outraContaCorrente, valorTransferenciaNegativo);
	    }
	}
}
	

