package projeto.entradasaida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class EscreverRelatorioRendimentoPoupanca {
	
	
	public static void relatorio (double valor, int dias, String nome)
	{
		LocalDate data = LocalDate.now();
	
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Rendimento de poupança de  - "+ nome + " - " + data + ".txt"));
			
			bw.write("-------------------Relatório de Rendimento de Poupança-----------");
			bw.write("\nRequisitante: " + nome);
			bw.write("\nValor investido: R$" + valor);
			bw.write("\nQuantidade de dias: " + dias);
			
			bw.write("\nO Rendimento da poupança após esse período será de: R$" + (valor + (valor * (dias * 0.001))) );
			bw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
