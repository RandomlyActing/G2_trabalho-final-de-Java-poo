package projeto.classes;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import projeto.entradasaida.EscreverRelatorioInformacoes;
import projeto.enums.CargosEnum;

public class Diretor extends Funcionario {

	public Diretor(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.cargo = CargosEnum.DIRETOR.name();
	}
	
	public void relatorioinformacoes(List<Cliente> cliente)
	{
		
		Collections.sort(cliente, Comparator.comparing(Pessoa :: getNome));
		for(Pessoa c : cliente)
		{
			if(c.getCargo().equals("CLIENTE"))
			{
				System.out.println("Nome: " + c.getNome() + " --- CPF: " + c.getCpf() );
			}
		}
		EscreverRelatorioInformacoes.relatorio(cliente);
		
	}

}
