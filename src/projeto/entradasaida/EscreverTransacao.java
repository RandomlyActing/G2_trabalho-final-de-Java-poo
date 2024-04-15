package projeto.entradasaida;

import projeto.classes.Conta;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class EscreverTransacao {
	
	public EscreverTransacao() {
	}
	public void escrevaSaque (double valor, String nome)
	{
		LocalDateTime dataTransacao = LocalDateTime.now();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("outputTransacoes.txt", true));
			bw.append("\nEm " + dataTransacao +", " + nome + " fez um saque de R$" + valor );
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
			BufferedWriter bw = new BufferedWriter(new FileWriter("outputTransacoes.txt", true));
			bw.append("\nEm " + dataTransacao + ", " + nome + " fez um deposito de R$" + valor );
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
			BufferedWriter bw = new BufferedWriter(new FileWriter("outputTransacoes.txt", true));
			bw.append("\nEm " + dataTransacao + ", "+ nome + " fez uma transferencia de R$" + valor +
			" para " + destino.getCliente().getNome() +"(" +destino.getCliente().getCpf() + ")" +
			" da agência" + destino.getAgencia() );
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
