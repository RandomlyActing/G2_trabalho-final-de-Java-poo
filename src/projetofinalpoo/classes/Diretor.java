package projetofinalpoo.classes;

public class Diretor extends Funcionario {

	public Diretor(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.setCargo("DIRETOR");
	}

}
