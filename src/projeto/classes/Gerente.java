package projeto.classes;

import java.util.List;

import projeto.entradasaida.EscreverRelatorioNumerodeContas;
import projeto.enums.CargosEnum;

public class Gerente extends Funcionario {

	private String agencia;
	
	public Gerente(String nome, String cpf, String senha, String agencia) {
		super(nome, cpf, senha);
		this.cargo = CargosEnum.GERENTE.name();
		this.agencia = agencia;
	}

	public String getAgencia() {
		return agencia;
	}
	
	public void numeroDeContas (List<ContaCorrente> contaCor)
	{
		int contador = 0;
		
		System.out.println("\n------------------ Relação de Contas--------------------------");
		
		
		for(Conta c: contaCor)
		{
			if ((c.getAgencia().equals(agencia)) && (c.getGerente().getNome().equals(nome)))
			{
				System.out.println("Tipo de Conta: " + c.getTipo() + " -------- Nome: " + c.getCliente().getNome());
				contador ++;
			}
		}
		
		System.out.println("Número de contas gerenciadas por " + nome + ": " + contador);
		EscreverRelatorioNumerodeContas.relatorio(contaCor, agencia, nome);
		
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	

}
