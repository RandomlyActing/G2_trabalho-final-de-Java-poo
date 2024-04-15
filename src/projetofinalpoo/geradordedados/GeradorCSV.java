package projetofinalpoo.geradordedados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import projetofinalpoo.classes.Cliente;
import projetofinalpoo.classes.Conta;
import projetofinalpoo.classes.ContaCorrente;
import projetofinalpoo.classes.ContaPoupanca;
import projetofinalpoo.classes.Diretor;
import projetofinalpoo.classes.Gerente;
import projetofinalpoo.classes.Pessoa;
import projetofinalpoo.classes.Presidente;


public class GeradorCSV {
	
	public static void main (String[] args)
	{
		leitorcsv();
		
	}
	
	public static void geradorcsv()
	{
		
		Cliente cli1 = new Cliente("Fernando da Silva", "111111111-11", "123456");
		Cliente cli2 = new Cliente("Felipe Haubrich", "222222222-22", "789456");
		Cliente cli3 = new Cliente("Marta Monteiro", "333333333-33", "456456");
		
		Gerente g1 = new Gerente("Mauricio Vasquez","444444444-44","111232");
		Gerente g2 = new Gerente("Nadia Corvalina","555555555-55","999888");
		Gerente g3 = new Gerente("Poliana Machado","666666666-66","123789");
		
		Diretor d1 = new Diretor("Fernando Henrique","777777777-77","987987");
		Presidente p1 = new Presidente("Aloisio Mercadante","888888888-88","666666");
		
		ContaCorrente c1 = new ContaCorrente(cli1,"2885",g1);
		ContaCorrente c2 = new ContaCorrente(cli2,"2885",g2);
		ContaCorrente c3 = new ContaCorrente(cli3,"2885",g3);
		ContaPoupanca c4 = new ContaPoupanca(cli3,"2885",g3);
		
		ArrayList <Pessoa> fila = new ArrayList<Pessoa>();
		ArrayList <Conta> fila2 = new ArrayList<Conta>();
		
		fila.add(p1);
		fila.add(d1);
		fila.add(cli1);
		fila.add(cli2);
		fila.add(cli3);
		fila.add(g1);
		fila.add(g2);
		fila.add(g3);
		fila2.add(c1);
		fila2.add(c2);
		fila2.add(c3);
		fila2.add(c4);
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("BANCODEDADOS.txt"));
			String linha;
			
			//backup das pessoas
			for(Pessoa a : fila)
			{
				linha = "\n" + a.getNome() + ";" + a.getCpf() + ";" + a.getSenha();
				bw.append(linha);
			}
			
			//Backup das contas
			for(Conta f : fila2)
			{
				linha = "\nCONTA;" + f.getTipo() + ";" + f.getCliente().getNome() + ";" + f.getCliente().getCpf() + ";" +f.getCliente().getSenha()
						+ ";" + f.getAgencia()
						+ ";" + f.getGerente().getNome() + ";" + f.getGerente().getCpf() + ";" +f.getGerente().getSenha();
				bw.append(linha);
			}
			
			bw.close();
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
		
		public static void leitorcsv()
		{
			try (BufferedReader br = new BufferedReader(new FileReader("BANCODEDADOS.TXT"))) {
	            String linha;
	            ArrayList<Cliente> cl = new ArrayList<Cliente>();
	            ArrayList<Gerente> ger = new ArrayList<Gerente>();
	            ArrayList<Diretor> dir =  new ArrayList<Diretor>();
	            ArrayList<Presidente> pres = new ArrayList<Presidente>();
	            ArrayList<ContaCorrente> cCor = new ArrayList<ContaCorrente>();
	            ArrayList<ContaPoupanca> cPou = new ArrayList<ContaPoupanca>();
	            while ((linha = br.readLine()) != null) {
	                String[] dados = linha.split(";"); // Separando os dados por ponto-e-vírgula

	                // Criando um objeto de acordo com o tipo de entidade
	                if (dados[0].equals("PRESIDENTE")) {
	                    Presidente presidente = new Presidente(dados[1], dados[2], dados[3]);
	                    pres.add(presidente);
	                    // Processar o objeto presidente
	                    System.out.println("Presidente: " + presidente);
	                } else if (dados[0].equals("DIRETOR")) {
	                    Diretor diretor = new Diretor(dados[1], dados[2], dados[3]);
	                    dir.add(diretor);
	                    // Processar o objeto diretor
	                    System.out.println("Diretor: " + diretor);
	                } else if (dados[0].equals("CLIENTE")) {
	                    Cliente cliente = new Cliente(dados[1], dados[2], dados[3]);
	                    cl.add(cliente);
	                    // Processar o objeto cliente
	                    System.out.println("Cliente: " + cliente);
	                } else if (dados[0].equals("GERENTE")) {
	                    Gerente gerente = new Gerente(dados[1], dados[2], dados[3]);
	                    ger.add(gerente);
	                    // Processar o objeto gerente
	                    System.out.println("Gerente: " + gerente);
	                } else if (dados[0].equals("CONTA") && dados[1].equals("Corrente")) {
	                    ContaCorrente conta = new ContaCorrente(new Cliente(dados[2], dados[3], dados[4]), dados[5], (new Gerente(dados[6], dados[7], dados[8])));
	                    cCor.add(conta);
	                    // Processar o objeto conta
	                    System.out.println("Conta: " + conta);
	                } else if (dados[0].equals("CONTA") && dados[1].equals("Poupança")) {
	                    ContaPoupanca conta = new ContaPoupanca(new Cliente(dados[2], dados[3], dados[4]), dados[5], (new Gerente(dados[6], dados[7], dados[8])));
	                    cPou.add(conta);
	                    // Processar o objeto conta
	                    System.out.println("Conta: " + conta);
	                }else {
	                    System.out.println("Tipo de entidade inválido: " + dados[0]);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			
			
			
		}
		
		
	}


