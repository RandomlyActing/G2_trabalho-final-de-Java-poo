package projeto.entradasaida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import projeto.classes.Conta;

public class EscreverRelatorioTotaldeCapital {
	
	private static DateTimeFormatter formatoDiaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static void relatorio (ArrayList<Conta> listaContas)
	{
		LocalDate data = LocalDate.now();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Relatório Total de Capital - "+ data + ".txt"));
			
			double acumulador = 0.0;
			for(Conta c : listaContas)
			{
				acumulador = acumulador + c.getSaldo();
			}
			
			bw.write("------------------ Relatório de Total de Capital--------------------------");
			bw.write("\n------------------ Data: " + data.format(formatoDiaHora) + " -------------------------------------");
			
			for(Conta c : listaContas)
			{
				bw.write("\nNome: " +c.getCliente().getNome() + " ----- Tipo de Conta: " + c.getTipo() + " ----- Saldo: R$" + c.getSaldo());			
			}
			
			bw.write("\n------------------ Total de Capital Acumulado--------------- R$" + acumulador);
			bw.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
