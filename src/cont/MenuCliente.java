package cont;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import projeto.classes.Conta;
import projeto.classes.ContaCorrente;
import projeto.exceptions.ContaException;

public final class MenuCliente{

	public final void menuCliente(Scanner in, ContaCorrente cliente) throws FileNotFoundException, ContaException{
		
		List<ContaCorrente> contaCor = Ler.contaCor;
		
		int menu = 0;
		int submenu = 0;
		int sair = 0;
			
		do {
		
			System.out.println("*** MENU *** \n");
			System.out.println("1 - Movimentações na Conta");
			System.out.println("2 - Relatórios");
			System.out.println("3 - Sair");
			menu = in.nextInt();
			
				switch (menu)
				{
				
					case 1:	
						do {
							System.out.println("\n*** MOVIMENTAÇÕES NA CONTA *** \n");
							System.out.println("1 - Saque");
							System.out.println("2 - Depósito");
							System.out.println("3 - Transferência para outra conta");
							System.out.println("4 - Retornar");
							System.out.println("5 - Sair");
							submenu = in.nextInt();
						
							switch (submenu) 
							{
								case 1:
									System.out.println("Saque \n");
									
									cliente.mostrarSaldo();
									System.out.println("\n*** Quanto gostaria de sacar? ***");
									double saq = in.nextDouble();
									
									cliente.saque(saq);
									cliente.mostrarSaldo();
									
									if (cliente.getSaldo() < 0) {
										System.out.println("*** Aviso Sua Conta Esta No Negativo!!! ***");
									}
									
									do {
									System.out.println("\n*** Gostaria de sair ou fazer outra operação *** \n");
									System.out.println("1 - Retornar");
									System.out.println("2 - Sair");
									sair = in.nextInt();
									if(sair == 2) { System.out.println("Volte sempre"); System.exit(0); }
									
									
									}while (sair != 1);
									break;
									
								case 2:
									System.out.println("Depósito.\n");
									
									cliente.mostrarSaldo();
									System.out.println("\n*** Quanto gostaria de depósitar? ***\n");
									double dep = in.nextDouble();
									
									
									cliente.deposito(dep);
									cliente.mostrarSaldo();
									
									do {
										System.out.println("\n*** Gostaria de sair ou fazer outra operação *** \n");
										System.out.println("1 - Retornar");
										System.out.println("2 - Sair");
										sair = in.nextInt();
										if(sair == 2) { System.out.println("Volte sempre"); System.exit(0); }
										
										
										}while (sair != 1);
										break;
									
								case 3:
									System.out.println("\n***Transferência para outra conta***\n");
									
									System.out.println("\n*** Quanto gostaria de Transferir para outra conta? ***\n");
									double trans = in.nextDouble();
									
									System.out.println("\n*** Para quem deseja transferir? ***\n");
									String cli = in.next();
									
									
									Conta transf = null;
									for (Conta c : contaCor) {
										if (c.getCliente().getCpf().equals(cli)) {
											transf = c;
											break;
										}
									}
									transf.getCliente().setCpf(cli);
										
									cliente.transferencia(transf , trans);
									cliente.mostrarSaldo();
									
									do {
										System.out.println("\n*** Gostaria de sair ou fazer outra operação *** \n");
										System.out.println("1 - Retornar");
										System.out.println("2 - Sair");
										sair = in.nextInt();
										if(sair == 2) { System.out.println("Volte sempre"); System.exit(0); }
										
										
										}while (sair != 1);
										break;	
							}
							
							
						if (submenu == 5) { System.out.println("Volte sempre"); System.exit(0); }
					
						}while (submenu != 4);
						break;
				case 2: 
					do {
						System.out.println("*** Relatórios ***");
						System.out.println("1 - Saldo.");
						System.out.println("2 - Relatório de tributação da conta corrente.");
						System.out.println("3 - Retornar.");
						System.out.println("4 - Sair.");
						submenu = in.nextInt();
					
						switch (submenu) {
							case 1:
								
								System.out.println("\n*** Saldo ***\n");
								cliente.mostrarSaldo();
								
								do {
									System.out.println("\n*** Gostaria de sair ou fazer outra operação *** \n");
									System.out.println("1 - Retornar");
									System.out.println("2 - Sair");
									sair = in.nextInt();
									if(sair == 2) { System.out.println("Volte sempre"); System.exit(0); }
									
									
									}while (sair != 1);
									break;
									
							case 2:
								
								System.out.println("\n*** Relatório de tributação da conta corrente ***\n");
								cliente.mostrarTotalTributacaov2();
								
								do {
									
									System.out.println("\n*** Gostaria de sair ou fazer outra operação *** \n");
									System.out.println("1 - Retornar");
									System.out.println("2 - Sair");
									sair = in.nextInt();
									if(sair == 2) { System.out.println("Volte sempre"); System.exit(0); }
									
									
									}while (sair != 1);
									break;
							}
						
						if (submenu == 4) { System.out.println("Volte sempre"); System.exit(0); }
					}while (submenu != 3);
					break;
					
			}
				
	}while (menu != 3);
	System.out.println("tchau");
	in.close();
}
}