package projeto.entradasaida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import projeto.classes.ItemListaTributacoes;
import projeto.enums.ValorMovimentacoes;

public class EscreverRelatorioTotalTributacoesV2 {
	private static LocalDate data = LocalDate.now();
	private static double totalOperacoes = 0.00;
	private static DateTimeFormatter formatoDiaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static DateTimeFormatter formatoDiaHora2 = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
	
	public static void relatorio (ArrayList<ItemListaTributacoes> listaTributacoes, String nome, String cpf)
	{
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Relatório de Tributacao de Clientes - " + nome + " - " + data + " v2.txt"));
			bw.write("--------------------RELATÓRIO DE GASTOS COM TRIBUTAÇÃO DE CONTAS-------------");
			bw.write("\nNOME: " + nome + " ------------ CPF:" + cpf + " ------------- DATA: " + data.format(formatoDiaHora));
			for(ItemListaTributacoes i : listaTributacoes)
			{
				bw.write("\nData: " + i.getDataTributacao().format(formatoDiaHora2) + " ------- Tipo:" + i.getTipoTributacao() + " ------ Valor: R$"
						+ String.format("%.2f", i.getValorTributacao()));
				totalOperacoes += i.getValorTributacao();
			}
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
