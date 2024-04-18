package cont;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projeto.classes.Cliente;
import projeto.classes.ContaCorrente;
import projeto.classes.ContaPoupanca;
import projeto.classes.Diretor;
import projeto.classes.Gerente;
import projeto.classes.Presidente;

public class Ler {

	public static List<ContaCorrente> contaCor;
	public static List<Gerente> gerentes;
	public static List<Diretor> diretores;
	public static List<Presidente> presidentes;
	public static List<ContaPoupanca> contaPou;
	
	public static void leitor() throws FileNotFoundException{
		
		
	    File pessoa = new File("pessoa.txt");
	    File contas = new File("contas.txt");
	    
	    contaCor = new ArrayList<ContaCorrente>();
	    gerentes = new ArrayList<Gerente>();
	    diretores = new ArrayList<Diretor>();
	    presidentes = new ArrayList<Presidente>();
	    contaPou = new ArrayList<ContaPoupanca>();
	    
	    @SuppressWarnings("resource")
	    Scanner is = new Scanner(contas);
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(pessoa);
	    
	    
	    while (sc.hasNext()) {
	        
	        
	    	String linha = sc.nextLine();
	    	
	    	
	        
	        if(linha != null) {
	            
	            String[] dados = linha.split("\\;");
	           

	            if (dados[0].equals("CLIENTE") ) {
	   
	            	
	            	while(is.hasNext()) {
	            		String cont = is.nextLine();
	            	
	            		String[] conta = cont.split("\\;");
	            	if (conta[0].equals("CORRENTE")) {
	            		Cliente cliente = new Cliente (conta[1], conta[2], conta[3]);
	            		Gerente gerente = new Gerente(conta[5], conta[6], conta[7], conta[4]);
		 	            
	            		ContaCorrente contaCorrente = new ContaCorrente (cliente, gerente.getAgencia(), gerente );
		            	
	            		contaCorrente.getCliente().setNome(conta[1]);
	            		contaCorrente.getCliente().setCpf(conta[2]);
	            		contaCorrente.getCliente().setSenha(conta[3]);
	            		
	            		contaCorrente.getGerente().setNome(conta[5]);
	            		contaCorrente.getGerente().setCpf(conta[6]);
	            		contaCorrente.getGerente().setSenha(conta[7]);
	            		contaCorrente.getGerente().setAgencia(conta[4]);
	            		
			            contaCor.add(contaCorrente);
	            		}
		            	
	            	if (conta[0].equals("POUPANCA")) {
	            		Cliente cliente = new Cliente (conta[1], conta[2], conta[3]);
	            		Gerente gerente = new Gerente (conta[1],conta[2],conta[3], conta[4]);
	            		ContaPoupanca contaPoupaca = new ContaPoupanca (cliente, gerente.getAgencia(), gerente);
		            	
	            		contaPoupaca.getCliente().setNome(conta[1]);
	            		contaPoupaca.getCliente().setCpf(conta[2]);
	            		contaPoupaca.getCliente().setSenha(conta[3]);
	            		
	            		contaPoupaca.getGerente().setNome(conta[5]);
	            		contaPoupaca.getGerente().setCpf(conta[6]);
	            		contaPoupaca.getGerente().setSenha(conta[7]);
	            		contaPoupaca.getGerente().setAgencia(conta[4]);
	            		
			            contaPou.add(contaPoupaca);
	            		}
	            	}
	            }
	            if (dados[0].equals("GERENTE") ) {
	            	
	            	Gerente gerente = new Gerente(dados[1], dados[2], dados[3], dados[4]);
	 	             
	            	gerente.setNome(dados[1]);
	 	            gerente.setCpf(dados[2]);
	 	            gerente.setSenha(dados[3]);
	 	            gerente.setAgencia(dados[4]);
	 	          
	 	            
	 	            gerentes.add(gerente);
	 	            
	            }
	            if (dados[0].equals("DIRETOR"))  {
	            	
	            	Diretor diretor = new Diretor(dados[1], dados[2],dados [3]);
	 	            
	            	diretor.setNome(dados[1]);
	            	diretor.setCpf(dados[2]);
	            	diretor.setSenha(dados[3]);
	 	            
	 	            
	            	diretores.add(diretor);

	            	
	            }
	            if (dados[0].equals("PRESIDENTE") ) {
	            	Presidente presidente = new Presidente(dados[1], dados[2], dados[3]);
	 	            
	            	presidente.setNome(dados[1]);
	 	            presidente.setCpf(dados[2]);
	 	            presidente.setSenha(dados[3]);
	 	            
	 	            
	 	            presidentes.add(presidente);
	            }
	           
	        }
	    
	    }
	    
	}
}


