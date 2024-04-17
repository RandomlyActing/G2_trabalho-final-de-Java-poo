package relatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


	class RelatorioClientes {
	    private List<Cliente> clientes;

	    public RelatorioClientes() {
	        this.clientes = new ArrayList<>();
	    }

	    // Método para adicionar um cliente ao relatório
	    public void adicionarCliente(Cliente cliente) {
	        clientes.add(cliente);
	    }

	    // Método para gerar o relatório em ordem alfabética
	    public void gerarRelatorio() {
	        // Ordena os clientes pelo nome
	        Collections.sort(clientes, Comparator.comparing(Cliente::getNome));

	        // Imprime o relatório
	        System.out.println("Relatório de Clientes:");
	        System.out.println("----------------------");
	        for (Cliente cliente : clientes) {
	            System.out.println("Nome: " + cliente.getNome());
	            System.out.println("CPF: " + cliente.getCpf());
	            System.out.println("Agência: " + cliente.getAgencia());
	            System.out.println();
	        }
	    }
	}



