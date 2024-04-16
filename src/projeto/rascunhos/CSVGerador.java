package projeto.rascunhos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import projeto.classes.Cliente;
import projeto.classes.Conta;
import projeto.classes.ContaCorrente;
import projeto.classes.ContaPoupanca;
import projeto.classes.Diretor;
import projeto.classes.Gerente;
import projeto.classes.Pessoa;
import projeto.classes.Presidente;

public class CSVGerador {
	
	public static void main (String[] args)
	{
		escreverCSV();
	}
	
	public static void escreverCSV()
	{
		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		ArrayList<Conta> listaContas = new ArrayList<Conta>();
		
		Cliente cli1 = new Cliente("Adalberto Fontes", "111111111-11", "123456" );
		Cliente cli2 = new Cliente("Joana Marinho", "222222222-22", "123456");
		Cliente cli3 = new Cliente("Mauricio Montes", "333333333-11", "123456" );
		Cliente cli4 = new Cliente("Valentina Camanho", "444444444-22", "123456");
		Cliente cli5 = new Cliente("Morgana Caixão", "111111111-11", "123456" );
				
		Gerente ger1 = new Gerente("Mariano Santomé","555555555-55", "123456", "2885");
		Gerente ger2 = new Gerente("Valentino Mordes","123456789-10", "123456", "2885");
		Gerente ger3 = new Gerente("Basilia Rodrigues","234567891-11", "123456", "2885");
		Gerente ger4 = new Gerente("Fortunato lampião","012345678-90", "123456", "2885");
		Gerente ger5 = new Gerente("Valéria Cardoso","888888888-88", "123456", "2885");
		
		Presidente pres1 = new Presidente("Fernando Henrique", "666666666-66", "123456");
		Diretor dir1 = new Diretor("Lulinha paz e amor", "999999999-99", "123456");
				
		ContaCorrente cC1 = new ContaCorrente(cli1, "2885", ger1);
		ContaCorrente cC2 = new ContaCorrente(cli2, "2885", ger2);
		ContaCorrente cC3 = new ContaCorrente(cli3, "2885", ger3);
		ContaCorrente cC4 = new ContaCorrente(cli4, "2885", ger4);
		ContaCorrente cC5 = new ContaCorrente(cli5, "2885", ger5);
		
		ContaPoupanca cP1 = new ContaPoupanca(cli1, "2885", ger1);
		ContaPoupanca cP2 = new ContaPoupanca(cli2, "2885", ger2);
		ContaPoupanca cP3 = new ContaPoupanca(cli3, "2885", ger3);
		ContaPoupanca cP4 = new ContaPoupanca(cli4, "2885", ger4);
		ContaPoupanca cP5 = new ContaPoupanca(cli5, "2885", ger5);
		
		
		String nomearquivo1 = "bdpessoas.txt";
		String nomearquivo2 = "bdcontas.txt";
		String separador = ";";
		
		listaPessoas.addAll(Arrays.asList(cli1,cli2,cli3,cli4,cli5,ger1,ger2,ger3,ger4,ger5,pres1,dir1));
		listaContas.addAll(Arrays.asList(cC1,cC2,cC3,cC4,cC5,cP1,cP2,cP3,cP4,cP5));
		
		try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nomearquivo1)))
		{
				
			for (Pessoa p : listaPessoas)
			{
				escritor.write(p.getCargo());
				escritor.write(separador);
				escritor.write(p.getNome());
				escritor.write(separador);
				escritor.write(p.getCpf());
				escritor.write(separador);
				escritor.write(p.getSenha());
				if(p.getCargo().equals("GERENTE"))
				{
					escritor.write(separador);
					escritor.write("2885");
				}
				escritor.newLine();
			}
			
			
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nomearquivo2)))
				{
			
					//ContaPoupanca cP5 = new ContaPoupanca(cli5, "2885", ger5);
					for (Conta c : listaContas)
					{
						escritor.write(c.getTipo());
						escritor.write(separador);
						escritor.write(c.getCliente().getNome());
						escritor.write(separador);
						escritor.write(c.getCliente().getCpf());
						escritor.write(separador);
						escritor.write(c.getCliente().getSenha());
						escritor.write(separador);
						escritor.write(c.getAgencia());
						escritor.write(separador);
						escritor.write(c.getGerente().getNome());
						escritor.write(separador);
						escritor.write(c.getGerente().getCpf());
						escritor.write(separador);
						escritor.write(c.getGerente().getSenha());
						escritor.newLine();
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		
		

		
		
		
				
	}
////	public static void lerPessoas()
////	{
////		 try (BufferedReader br = new BufferedReader(new FileReader("bdpessoas.txt"))) {
////	            String linha;
////	            while ((linha = br.readLine()) != null) {
////	                String[] dados = linha.split(";");
////	                String tipoEntidade = dados[0];
////	                String nome = dados[1];
////	                String cpf = dados[2];
////	                String senha = dados[3];
////
////	                Pessoa entidade;
////	                switch (tipoEntidade) {
////	                    case "CLIENTE":
////	                        entidade = new Cliente(nome, cpf, senha);
////	                        break;
////	                    case "GERENTE":
////	                        entidade = new Gerente(nome, cpf, senha);
////	                        break;
////	                    case "PRESIDENTE":
////	                        entidade = new Presidente(nome, cpf, senha);
////	                        break;
////	                    case "DIRETOR":
////	                        entidade = new Diretor(nome, cpf, senha);
////	                        break;
////	                    default:
////	                        throw new IllegalArgumentException("Tipo de entidade inválido: " + tipoEntidade);
////	                }
////
////	                System.out.println(entidade);
////	            }
////	        } catch (IOException e) {
////	            e.printStackTrace();
////	        }
//		
//	}

}
