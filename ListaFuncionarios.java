package banco;

import java.util.ArrayList;

public class ListaFuncionarios {

	private ArrayList<Funcionarios> func = new ArrayList<Funcionarios>();
	
	public void cadastrarFuncionario (Funcionarios funcionarios) {
		if(func != null) {
			func.add(funcionarios);
		}
	}
	
	public void deletar(Funcionarios funcionarios) {
		func.removeIf((elemento)-> elemento.getNome().equals(funcionarios.getNome()));
	}
	
	public Funcionarios buscarFunc(Funcionarios funcio) {
		for(Funcionarios elemento:this.func) {
			if(elemento.getCpf().equalsIgnoreCase(funcio.getNome()));
			return elemento;
		}
		return null;
	}

	

	public void editarFunc(Funcionarios funci){
		int indice = func.indexOf(this.buscarFunc(funci));
		if(indice != -1) {
			func.set(indice, funci);
		}
	}
}

