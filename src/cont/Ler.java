package cont;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projeto.classes.Cliente;
import projeto.classes.Diretor;
import projeto.classes.Gerente;
import projeto.classes.Presidente;

public class Ler {

	public static List<Cliente> clientes;
	public static List<Gerente> gerentes;
	public static List<Diretor> diretores;
	public static List<Presidente> presidentes;
	
	public static void leitor() throws FileNotFoundException{
		
	    File pessoa = new File("\\pessoa.txt");
	    clientes = new ArrayList<Cliente>();
	    gerentes = new ArrayList<Gerente>();
	    diretores = new ArrayList<Diretor>();
	    presidentes = new ArrayList<Presidente>();
	    
	    @SuppressWarnings("resource")
	    Scanner sc = new Scanner(pessoa);
	    
	    
	    while (sc.hasNext()) {
	        
	        String linha = sc.nextLine();
	        
	        
	        if(linha != null) {
	            
	            String[] dados = linha.split("\\;");
	            

	            if (dados[1].equals("CLIENTE") ) {
	            
	            	
		            Cliente cliente = new Cliente(dados[5], dados[6], dados[7]);
		            
		            cliente.setTipo(Integer.parseInt(dados[2]));
		            cliente.setNome(dados[5]);
		            cliente.setCpf(dados[6]);
		            cliente.setSenha(dados[7]);
		           
		            
		            clientes.add(cliente);
	            	}
	            
	            if (dados[1].equals("GERENTE") ) {
	            	
	            	Gerente gerente = new Gerente(dados[2], dados[3], dados[4], dados[5]);
	 	             
	            	gerente.setNome(dados[2]);
	 	            gerente.setCpf(dados[3]);
	 	            gerente.setSenha(dados[4]);
	 	            gerente.setAgencia(dados[5]);
	 	          
	 	            
	 	            gerentes.add(gerente);
	 	            
	            }
	            if (dados[1].equals("DIRETOR"))  {
	            	
	            	Diretor diretor = new Diretor(dados[2], dados[3],dados [4]);
	 	            
	            	diretor.setNome(dados[2]);
	            	diretor.setCpf(dados[3]);
	            	diretor.setSenha(dados[4]);
	 	            
	 	            
	            	diretores.add(diretor);

	            	
	            }
	            if (dados[1].equals("PRESIDENTE") ) {
	            	Presidente presidente = new Presidente(dados[2], dados[3], dados[4]);
	 	            
	            	presidente.setNome(dados[2]);
	 	            presidente.setCpf(dados[3]);
	 	            presidente.setSenha(dados[4]);
	 	            
	 	            
	 	            presidentes.add(presidente);
	            }
	            
	        }
	    
	    }
	    
	}
}


