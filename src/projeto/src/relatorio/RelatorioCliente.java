package projeto.src.relatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


	class RelatorioClientes {
	    private List<Cliente> clientes;

	    public RelatorioClientes() {
	        this.clientes = new ArrayList<>();
	    }

	    // M�todo para adicionar um cliente ao relat�rio
	    public void adicionarCliente(Cliente cliente) {
	        clientes.add(cliente);
	    }

	    // M�todo para gerar o relat�rio em ordem alfab�tica
	    public void gerarRelatorio() {
	        // Ordena os clientes pelo nome
	        Collections.sort(clientes, Comparator.comparing(Cliente::getNome));

	        // Imprime o relat�rio
	        System.out.println("Relat�rio de Clientes:");
	        System.out.println("----------------------");
	        for (Cliente cliente : clientes) {
	            System.out.println("Nome: " + cliente.getNome());
	            System.out.println("CPF: " + cliente.getCpf());
	            System.out.println("Ag�ncia: " + cliente.getAgencia());
	            System.out.println();
	        }
	    }
	}



