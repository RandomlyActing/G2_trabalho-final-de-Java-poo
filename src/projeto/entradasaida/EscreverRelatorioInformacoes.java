package projeto.entradasaida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import projeto.classes.Pessoa;

public class EscreverRelatorioInformacoes {
	
	public static void relatorio (ArrayList<Pessoa> listaPessoas)
	{
		LocalDate data = LocalDate.now();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Relatório de informações dos Clientes - "+ data +".txt"));
			bw.write("-----------------------Relatório de Informações dos Clientes-----------------");
			for(Pessoa c : listaPessoas)
			{
				bw.write("\nNome: " + c.getNome() + " -------- CPF: " + c.getCpf());
			}
			
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
