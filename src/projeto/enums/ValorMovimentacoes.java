package projeto.enums;

public enum ValorMovimentacoes {
	
	
	SAQUE(0.1), DEPOSITO(0.1), TRANSFERENCIA(0.2);
	
	private double valorPorMovimentacao;

	private ValorMovimentacoes(double valorPorMovimentacao) {
		this.valorPorMovimentacao = valorPorMovimentacao;
	}

	public double getValorPorMovimentacao() {
		return valorPorMovimentacao;
	}
	
	
	
	

}
