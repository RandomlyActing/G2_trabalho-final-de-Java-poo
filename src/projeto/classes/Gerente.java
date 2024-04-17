package projeto.classes;

import java.util.ArrayList;

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
	
	public void numeroDeContas (ArrayList<Conta> listaContas)
	{
		int contador = 0;
		
		System.out.println("\n------------------ Relação de Contas--------------------------");
		
		
		for(Conta c: listaContas)
		{
			if ((c.getAgencia().equals(agencia)) && (c.getGerente().getNome().equals(nome)))
			{
				System.out.println("Tipo de Conta: " + c.getTipo() + " -------- Nome: " + c.getCliente().getNome());
				contador ++;
			}
		}
		
		System.out.println("Número de contas gerenciadas por " + nome + ": " + contador);
		EscreverRelatorioNumerodeContas.relatorio(listaContas, agencia, nome);
		
	}

}
