package cont;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import projeto.classes.Cliente;
import projeto.classes.Diretor;
import projeto.classes.Gerente;
import projeto.classes.Presidente;


public final class Login{

		public final void login () throws FileNotFoundException {
			Scanner in = new Scanner(System.in);
			String opcao = "0";
			String loginDigitado = "";
			String senhaDigitada = "";
			
			List<Cliente> clientes = Ler.clientes;
			List<Gerente> gerentes = Ler.gerentes;
			List<Presidente> presidentes = Ler.presidentes;
			List<Diretor> diretores = Ler.diretores;
			
			do {
				
				System.out.println("Digite seu login: ");
				loginDigitado = in.nextLine();
				
				System.out.println("Digite sua senha: ");
				senhaDigitada = in.nextLine();
				
				
				Cliente cliente = null;
				for (Cliente c : clientes) {
					if (c.getCpf().equals(loginDigitado)) {
						cliente = c;
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
				
				if (cliente != null && cliente.getSenha().equals(senhaDigitada)) {
					MenuCliente menuCliente = new MenuCliente();
					menuCliente.menuCliente(in, cliente);
					
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
