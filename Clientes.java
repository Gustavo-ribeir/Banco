package banco;

public class Clientes {

	private String nome;
	private String cpf;
	
	
	public Clientes(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	
	public Clientes(String cpf) {
		this.cpf = cpf;
	}



	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	
	
	
	
	
}
