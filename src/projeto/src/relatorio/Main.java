package projeto.src.relatorio;

public class Main {

	public static void main(String[] args) {
		// Criando alguns clientes de exemplo
        Cliente cliente1 = new Cliente("Maria Florinda ", "123.456.789-00", "001");
        Cliente cliente2 = new Cliente("Jos� Girafales ", "987.654.321-00", "002");
        Cliente cliente3 = new Cliente("J�o Jaiminho", "111.222.333-44", "003");

        // Criando o relat�rio
        RelatorioClientes relatorio = new RelatorioClientes();

        // Adicionando os clientes ao relat�rio
        relatorio.adicionarCliente(cliente1);
        relatorio.adicionarCliente(cliente2);
        relatorio.adicionarCliente(cliente3);

        // Gerando e imprimindo o relat�rio
        relatorio.gerarRelatorio();
    }
}
