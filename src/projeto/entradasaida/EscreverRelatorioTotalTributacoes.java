package projeto.entradasaida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import projeto.enums.ValorMovimentacoes;

public class EscreverRelatorioTotalTributacoes {
	private static LocalDate data = LocalDate.now();
	private static DateTimeFormatter formatoDiaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static void relatorio (double totalOperacoes, String nome, String cpf)
	{
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Relatório de Tributacao de Clientes - " + nome + " - " + data + ".txt"));
			bw.write("--------------------RELATÓRIO DE GASTOS COM TRIBUTAÇÃO DE CONTAS-------------");
			bw.write("\nNOME: " + nome + " ------------ CPF:" + cpf + " ------------- DATA: " + data.format(formatoDiaHora));
			bw.write("\nO TOTAL DE GASTOS COM TRIBUTAÇÕES DE SUA CONTA: R$" + String.format("%.2f", totalOperacoes) );
			bw.write("\n----------------------------------------------------------------------------");
			bw.newLine();
			bw.write("\n----------------------------------------------------------------------------");
			bw.write("\n---------------------EXPLICATIVO DAS TRANSAÇÕES-----------------------------");
			bw.write("\n----------------------------------------------------------------------------");
			bw.newLine();
			bw.write("\nTodo saque na sua conta corrente custará R$" + String.format( "%.2f",ValorMovimentacoes.SAQUE.getValorPorMovimentacao()));
			bw.write("\nTodo depósito na sua conta corrente custará R$" + String.format( "%.2f",ValorMovimentacoes.DEPOSITO.getValorPorMovimentacao()));
			bw.write("\nToda Transferência na sua conta corrente custará R$" + String.format( "%.2f",ValorMovimentacoes.TRANSFERENCIA.getValorPorMovimentacao()));
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
