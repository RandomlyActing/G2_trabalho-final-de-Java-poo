package projeto.classes;

import java.time.LocalDate;
import java.util.List;

import projeto.entradasaida.EscreverRelatorioTotaldeCapital;
import projeto.enums.CargosEnum;

public class Presidente extends Funcionario {

	public Presidente(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.cargo = CargosEnum.PRESIDENTE.name();
		
	}
	
	public void totaldeCapital (List<Conta> contageral)
	{
		LocalDate data = LocalDate.now();
		double acumulador = 0.0;
		
		for(Conta c : contageral)
		{
			acumulador = acumulador + c.getSaldo();
		}
		
		System.out.println("------------------ Relatório de Total de Capital--------------------------");
		System.out.println("------------------ Data: " + data + " -------------------------------------");
		
		for(Conta c : contageral)
		{
			System.out.println("Nome: " +c.getCliente().getNome() + " ----- Tipo de Conta: " + c.getTipo() + " ----- Saldo: R$" + c.getSaldo());			
		}
		
		System.out.println("------------------ Total de Capital Acumulado--------------- R$" + acumulador);
		
		EscreverRelatorioTotaldeCapital.relatorio(contageral);
		
		
			
	}
	

}
