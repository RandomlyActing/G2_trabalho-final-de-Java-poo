package projeto.src.relatorio;



	class Cliente {
	    private String nome;
	    private String cpf;
	    private String agencia;
	    
	

	    public Cliente(String nome, String cpf, String agencia) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.agencia = agencia;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public String getAgencia() {
	        return agencia;
	    }
	}	