package projetofinalpoo.classes;

public class Diretor extends Funcionario {

	public Diretor(String cpf, String senha) {
		super(cpf, senha);
		this.setCargo("DIRETOR");
	}

}
