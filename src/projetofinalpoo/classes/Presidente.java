package projetofinalpoo.classes;

public class Presidente extends Funcionario {

	public Presidente(String cpf, String senha) {
		super(cpf, senha);
		this.setCargo("PRESIDENTE");
	}

}
