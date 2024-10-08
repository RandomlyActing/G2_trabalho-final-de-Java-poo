package projeto.entradasaida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import projeto.classes.Conta;

public class EscreverRelatorioMostrarSaldo {
	
	private static DateTimeFormatter formatoDiaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static void relatorio (Conta escopo)
	{
		LocalDate data = LocalDate.now();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Saldo da conta - "+ escopo.getCliente().getNome() + " - " + data + ".txt"));
			bw.write("------------------ Relatório de Saldo da Conta--------------------------");
			bw.write("\n------------------ Data: " + data.format(formatoDiaHora) + " -------------------------------------");
			bw.write("\nNome: " + escopo.getCliente().getNome() + " ---- CPF:" + escopo.getCliente().getCpf());
			bw.write("\nTipo de Conta: " + escopo.getTipo() + "----- Agência: " + escopo.getAgencia());
			bw.write("Saldo da conta: R$" + escopo.getSaldo());
			bw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
