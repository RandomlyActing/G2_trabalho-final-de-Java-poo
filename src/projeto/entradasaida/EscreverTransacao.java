package projeto.entradasaida;

import projeto.classes.Conta;
import projeto.enums.ValorMovimentacoes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EscreverTransacao {
	
	//formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
	private DateTimeFormatter formatoDiaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
	
	public EscreverTransacao() {
	}
	public void escrevaSaque (double valor, String nome)
	{
		LocalDateTime dataTransacao = LocalDateTime.now();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("BACKLOGTransacoes.txt", true));
			bw.append("\n" + dataTransacao.format(formatoDiaHora) +" ---- " + nome + " ---- Transação: "
			+ ValorMovimentacoes.SAQUE.name() +" ----  R$" + valor );
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void escrevaDeposito (double valor, String nome)
	{
		LocalDateTime dataTransacao = LocalDateTime.now();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("BACKLOGTransacoes.txt", true));
			bw.append("\n" + dataTransacao.format(formatoDiaHora) +" ---- " + nome + " ---- Transação: "
					+ ValorMovimentacoes.DEPOSITO.name() +" ----  R$" + valor );
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void escrevaTransFerencia (Conta destino, double valor, String nome)
	{
		LocalDateTime dataTransacao = LocalDateTime.now();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("BACKLOGTransacoes.txt", true));
			bw.append("\n" + dataTransacao.format(formatoDiaHora) +" ---- " + nome + " ---- Transação: "
					+ ValorMovimentacoes.TRANSFERENCIA.name() + " Para: "+ destino.getCliente().getNome()
					+ " (" + destino.getCliente().getCpf() + ") ----  R$" + valor );
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
