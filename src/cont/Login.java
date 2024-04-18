package cont;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import projeto.classes.ContaCorrente;
import projeto.classes.ContaPoupanca;
import projeto.classes.Diretor;
import projeto.classes.Gerente;
import projeto.classes.Presidente;
import projeto.enums.CargosEnum;
import projeto.exceptions.ContaException;


public final class Login{

		public final void login () throws FileNotFoundException, ContaException {
			Scanner in = new Scanner(System.in);
			String opcao = "0";
			String loginDigitado = "";
			String senhaDigitada = "";
			
			List<ContaCorrente> contaCor = Ler.contaCor;
			List<ContaPoupanca> contaPou = Ler.contaPou;
			List<Gerente> gerentes = Ler.gerentes;
			List<Presidente> presidentes = Ler.presidentes;
			List<Diretor> diretores = Ler.diretores;
			
			do {
				
				System.out.println("Digite seu login: ");
				loginDigitado = in.nextLine();
				
				System.out.println("Digite sua senha: ");
				senhaDigitada = in.nextLine();
				
				
				ContaCorrente cliente = null;
				for (ContaCorrente c : contaCor) {
					if (c.getCliente().getCpf().equals(loginDigitado)) {
						cliente = c;
						break;
					}
				}
				
				ContaPoupanca clientepou = null;
				for (ContaPoupanca c : contaPou) {
					if (c.getCliente().getCpf().equals(loginDigitado)) {
						clientepou = c;
						break;
					}
				}
				
				Gerente gerente = null;
				for (Gerente g : gerentes) {
					if (g.getCpf().equals(loginDigitado)) {
						gerente = g;
						break;
					}
				}
				
				Diretor diretor = null;
				for (Diretor d : diretores) {
					if (d.getCpf().equals(loginDigitado)) {
						diretor = d;
						break;
					}
				}
				
				Presidente presidente = null;
				for (Presidente p : presidentes) {
					if (p.getCpf().equals(loginDigitado)) {
						presidente = p;
						break;
					}
				}
				
				if (cliente != null && cliente.getCliente().getSenha().equals(senhaDigitada)) {
					
					if (gerente != null && gerente.getSenha().equals(senhaDigitada)) {
						System.out.println("Gostaria de entrar em sua conta ou como gerente?"
								+ "\n1:Entrar Como conta"
								+ "\n2:Entrar como gerente");
						int sn = in.nextInt();
						if(sn == 2) {
						MenuGerente menuGerente = new MenuGerente();
						menuGerente.menuFuncionario(in, gerente);
						}else {
							System.out.println("Fale qual tipo de conta que gostaria de entrar "
									+ "\n1: Conta Corrente"
									+ "\n2: Conta Poupança");
							int escolha = in.nextInt();
							if (escolha == 1 && cliente.getTipo().equals("CORRENTE")) { 
								
							MenuCliente menuCliente = new MenuCliente();
							menuCliente.menuCliente(in, cliente);
							
							}
						}
						
					}else if (cliente.getCliente().getCargo().equals(CargosEnum.CLIENTE.name())) {
					
					System.out.println("Fale qual tipo de conta que gostaria de entrar "
							+ "\n1: Conta Corrente"
							+ "\n2: Conta Poupança");
					int escolha = in.nextInt();
					
					if (escolha == 1 && cliente.getTipo().equals("CORRENTE")) { 
						
					MenuCliente menuCliente = new MenuCliente();
					menuCliente.menuCliente(in, cliente);
					}
					
					if (escolha == 2 && clientepou.getTipo().equals("POUPANCA")) {
						
						MenuClientePou menuClientePou = new MenuClientePou();
						menuClientePou.menuClientePou(in, clientepou);
					}
					}else {
						
						System.out.println("Escolheu nenhuma das contas, estarei removendo do sistema.");
						System.exit(0);
					}
					
				}else if (gerente != null && gerente.getSenha().equals(senhaDigitada)) {
					MenuGerente menuGerente = new MenuGerente();
					menuGerente.menuFuncionario(in, gerente);
					
				}else if (diretor != null && diretor.getSenha().equals(senhaDigitada)) {
					MenuDiretor menuDiretor = new MenuDiretor();
					menuDiretor.menuDiretor(in, diretor);
					
				}else if (presidente != null && presidente.getSenha().equals(senhaDigitada)) {
					MenuPresidente menuPresidente = new MenuPresidente();
					menuPresidente.menuPresidente(in, presidente);
					
				}else {
					
				System.out.println("Login ou senha erradas!");
				System.out.println("Quer tentar novamente (s/n): ");
				opcao = in.nextLine();}
				
			}while(opcao.equals("S") || opcao.equals("s"));
		}
}
