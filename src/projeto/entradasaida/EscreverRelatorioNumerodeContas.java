package projeto.entradasaida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import projeto.classes.Conta;

public class EscreverRelatorioNumerodeContas {
	
	private static DateTimeFormatter formatoDiaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static void relatorio (ArrayList<Conta> escopo, String agencia, String nome)
	{
		int contador = 0;
		LocalDate data = LocalDate.now();
		
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Relatório de Número de Contas do Gerente " + nome + " - "+ data + ".txt"));
			
			bw.write("------------------ Relação de Contas--------------------------");
			bw.write("\nGerente ------- " + nome + " -----------Data: " + data.format(formatoDiaHora));
	
			for(Conta c: escopo)
			{
				if ((c.getAgencia().equals(agencia)) && (c.getGerente().getNome().equals(nome)))
				{
					bw.write("\nTipo de Conta: " + c.getTipo() + " -------- Nome: " + c.getCliente().getNome());
					contador ++;
				}
			}
			
			bw.write("\nNúmero de contas gerenciadas por " + nome + ": " + contador);
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}


