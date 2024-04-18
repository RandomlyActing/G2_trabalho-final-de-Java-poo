package cont;

import java.util.List;
import java.util.Scanner;

import projeto.classes.ContaCorrente;
import projeto.classes.Gerente;

public final class MenuGerente {
	public final void menuFuncionario(Scanner in, Gerente gerente) {

		List<ContaCorrente> contaCor = Ler.contaCor;
		int menu;
		int submenu = 0;
		int sair = 0;
		
		do {
			System.out.println("*** MENU *** \n");
			System.out.println("1 - Relatórios.");
			System.out.println("2 - Sair.");
			menu = in.nextInt();
			
				switch (menu) 
				{
					case 1:
						do {
							System.out.println("\n*** Relatórios ***\n");
							System.out.println("1 - Relatório do número contas na mesma agência em que este gerente trabalha. ");
							System.out.println("2 - Retornar.");
							System.out.println("3 - Sair.");
							submenu = in.nextInt();
							
								switch (submenu) {
									case 1:
										System.out.println("\n*** Relatório do número contas na mesma agência em que este gerente trabalha. ***\n");
										gerente.numeroDeContas(contaCor);
										
										
										do {
											System.out.println("\n*** Gostaria de sair ou fazer outra operação *** \n");
											System.out.println("1 - Retornar");
											System.out.println("2 - Sair");
											sair = in.nextInt();
											if(sair == 2) { System.out.println("Volte sempre"); System.exit(0); }
											
											
											}while (sair != 1);
											break;
								}
								
								if (submenu == 3) { System.out.println("Volte sempre"); System.exit(0); }
							
						}while (submenu != 2);
						break;
		}
	}while (menu != 2);
		System.out.println("tchau");
		in.close();
	}
}
