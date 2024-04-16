package projeto;

public class main {

	public static void main(String[] args) {
		 // Criando alguns clientes de exemplo
        Cliente cliente1 = new Cliente("Gabriel ", "123.456.789-00", "001");
        Cliente cliente2 = new Cliente("Guido ", "987.654.321-00", "002");
        Cliente cliente3 = new Cliente("Ian", "111.222.333-44", "003");

        // Criando o relatório
        RelatorioClientes relatorio = new RelatorioClientes();

        // Adicionando os clientes ao relatório
        relatorio.adicionarCliente(cliente1);
        relatorio.adicionarCliente(cliente2);
        relatorio.adicionarCliente(cliente3);

        // Gerando e imprimindo o relatório
        relatorio.gerarRelatorio();
    }

	}


