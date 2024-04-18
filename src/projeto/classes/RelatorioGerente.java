package projeto.classes;

import java.util.ArrayList;

import projeto.enums.ValorMovimentacoes;

public class RelatorioGerente {
	
	public static void Relatorios() {
		System.out.println("------------Relatorio------------");
		System.out.println("Saldo: "+ gerente.getSaldo());
		System.out.println("Gastos: "+ gerente.getGastos());
		System.out.println("Valores: \nDeposito: "+ ValorMovimentacoes.DEPOSITO +"\nSaque: "+ ValorMovimentacoes.SAQUE+ "\nTranferencia: "+ ValorMovimentacoes.TRANSFERENCIA);
		
	}
	
	public static void rendimentoPoupanca (double valor, int dias)
	{
		System.out.println("O rendimento de R$" + valor + " em " + dias + " dias será R$" + (valor + (valor * (dias * 0.001))));
	}
	
	public void relatorioSav(ArrayList<Conta> listaContas) {
		int Cont = 0; 
		
		
		for(Conta c: listaContas) {
			if((c.getAgencia().equals(gerente.getAgencia())) && (c.getGerente().equals(gerente.getAgencia()))){
				Cont ++;
			}
			System.out.println("O número de contas de clientes dirigidos por "+ gerente.getNome()+"nesta agencia: "+ Cont);
		}
		
		
	}
}
	
