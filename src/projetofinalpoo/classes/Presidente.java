package projetofinalpoo.classes;

public class Presidente extends Funcionario {

	public Presidente(String nome,String cpf, String senha) {
		super(nome,cpf, senha);
		this.setCargo("PRESIDENTE");
	}

}
