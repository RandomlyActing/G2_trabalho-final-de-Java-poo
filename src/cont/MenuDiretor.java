package cont;

import java.util.List;
import java.util.Scanner;

import projeto.classes.Cliente;
import projeto.classes.Diretor;

public final class MenuDiretor {

	public final void menuDiretor(Scanner in, Diretor diretor) {
		
		List<Cliente> cliente = Ler.cliente;
		int menu;
		int submenu;
		int sair;
		
		do {
			System.out.println("*** MENU *** \n");
			System.out.println("1 - Relatórios. ");
			System.out.println("2 - Sair.");
			menu = in.nextInt();
			
			switch (menu) 
			{
			
				case 1:
					do {
						System.out.println("\n*** Impressão do Relatorio *** \n");
						System.out.println("1 - Imprimir Relatorio. ");
						System.out.println("2 - Retornar. ");
						System.out.println("3 - Sair da conta.");
						submenu = in.nextInt();
					
							switch (submenu) {
									case 1: 
										System.out.println("*** Relatorio com as informações ***");
										diretor.relatorioinformacoes(cliente);
										
										do{
											System.out.println("\n *** Gostaria de fazer outra operação? ***\n");
											System.out.println("1 - Retornar");
											System.out.println("2 - Sair");
											sair = in.nextInt();
											
											if(sair == 2) { System.out.println("Volte sempre"); System.exit(0); }
											
											}while (sair != 1);
											break;
											
									case 3:
										System.out.println("tchau");
										System.exit(0);
										break;
										}
								break;		
						}while (submenu != 2);
						
			}
			
		}while (menu != 2);
		
		System.out.println("tchau");
		in.close();
		
	}

}
