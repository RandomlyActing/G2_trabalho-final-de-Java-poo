package cont;

import java.util.Scanner;

import projeto.classes.Cliente;

public final class MenuCliente{

	public final void menuCliente(Scanner in, Cliente num){
		
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
									System.out.println("Saque");
									
									do {
									System.out.println("\n*** Gostaria de sair ou fazer outra operação *** \n");
									System.out.println("1 - Retornar");
									System.out.println("2 - Sair");
									sair = in.nextInt();
									if(sair == 2) { System.out.println("Volte sempre"); System.exit(0); }
									
									
									}while (sair != 1);
									break;
									
								case 2:
									System.out.println("Depósito.");
									
									do {
										System.out.println("\n*** Gostaria de sair ou fazer outra operação *** \n");
										System.out.println("1 - Retornar");
										System.out.println("2 - Sair");
										sair = in.nextInt();
										if(sair == 2) { System.out.println("Volte sempre"); System.exit(0); }
										
										
										}while (sair != 1);
										break;
									
								case 3:
									System.out.println("Transferência para outra conta");
									
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
						System.out.println("3 - Relatório de Rendimento da poupança.");
						System.out.println("4 - Retornar.");
						System.out.println("5 - Sair.");
						submenu = in.nextInt();
					
						switch (submenu) {
							case 1:
								System.out.println("*** Saldo ***");
								
								do {
									System.out.println("\n*** Gostaria de sair ou fazer outra operação *** \n");
									System.out.println("1 - Retornar");
									System.out.println("2 - Sair");
									sair = in.nextInt();
									if(sair == 2) { System.out.println("Volte sempre"); System.exit(0); }
									
									
									}while (sair != 1);
									break;
									
							case 2:
								System.out.println("*** Relatório de tributação da conta corrente ***");
								do {
									
									System.out.println("\n*** Gostaria de sair ou fazer outra operação *** \n");
									System.out.println("1 - Retornar");
									System.out.println("2 - Sair");
									sair = in.nextInt();
									if(sair == 2) { System.out.println("Volte sempre"); System.exit(0); }
									
									
									}while (sair != 1);
									break;
							case 3:
								System.out.println("*** Relatório de Rendimento da poupança ***");
								
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
					
			}
				
	}while (menu != 3);
	System.out.println("tchau");
	in.close();
}
}