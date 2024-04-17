package projeto.classes;

import java.time.LocalDateTime;

public class ItemListaTributacoes {
	private LocalDateTime dataTributacao;
	private String tipoTributacao;
	private double valorTributacao;
	
	public ItemListaTributacoes(LocalDateTime dataTributacao, String tipoTributacao, double valorTributacao) {
		this.dataTributacao = dataTributacao;
		this.tipoTributacao = tipoTributacao;
		this.valorTributacao = valorTributacao;
	}

	public LocalDateTime getDataTributacao() {
		return dataTributacao;
	}

	public String getTipoTributacao() {
		return tipoTributacao;
	}

	public double getValorTributacao() {
		return valorTributacao;
	}
	
	
	
	
	
}
