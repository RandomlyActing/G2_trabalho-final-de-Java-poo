package projeto.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import projeto.entradasaida.EscreverRelatorioInformacoes;
import projeto.enums.CargosEnum;

public class Diretor extends Funcionario {

	public Diretor(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.cargo = CargosEnum.DIRETOR.name();
	}
	
	public void relatorioinformacoes(ArrayList<Pessoa> listaPessoas)
	{
		
		Collections.sort(listaPessoas, Comparator.comparing(Pessoa :: getNome));
		for(Pessoa c : listaPessoas)
		{
			if(c.getCargo().equals("CLIENTE"))
			{
				System.out.println("Nome: " + c.getNome() + " --- CPF: " + c.getCpf() );
			}
		}
		EscreverRelatorioInformacoes.relatorio(listaPessoas);
		
	}

}
