package projeto.entradasaida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import projeto.classes.Pessoa;

public class EscreverRelatorioInformacoes {
	
	
	private static DateTimeFormatter formatoDiaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static void relatorio (ArrayList<Pessoa> listaPessoas)
	{
		LocalDate data = LocalDate.now();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Relatório de informações dos Clientes - "+ data +".txt"));
			bw.write("-----------------------Relatório de Informações dos Clientes-----------------");
			bw.write("\nData: " + data.format(formatoDiaHora) + "------------------------------------");
			for(Pessoa c : listaPessoas)
			{
				if(c.getCargo().equals("CLIENTE"))
				{
				bw.write("\nNome: " + c.getNome() + " -------- CPF: " + c.getCpf());
				}
			}
			
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
