package banco;

import java.util.ArrayList;


public class ListaGerente {
	
	private ArrayList<Gerente> gerente = new ArrayList<Gerente>();
	
	public void cadastarGerente(Gerente ger) {
		if(ger != null) {
			gerente.add(ger);
		}
	}
	public void deletar(Gerente ger) {
		gerente.removeIf((elemento)-> elemento.getCpf().equals(ger.getCpf()));
	}
	
	public Gerente buscarGerente(Gerente ger) {
		for(Gerente elemento:this.gerente) {
			if(elemento.getNome().equalsIgnoreCase(ger.getNome()));
			return elemento;
		}
		return null;
	}
	public void editarGer(Gerente ger){
		int indice =gerente.indexOf(this.buscarGerente(ger));
		if(indice != -1) {
			gerente.set(indice, ger);
		}

	
	}
	
		
	
	
	
}
	


	
	
	
	
	

