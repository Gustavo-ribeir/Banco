package banco;

public class Funcionarios {
	private String nome;
	private String cpf;
	
	public Funcionarios(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		
	}
	
	
	public Funcionarios(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	
	
	
}
