package banco;

import java.util.ArrayList;

public class ListaClientes {
	private ArrayList<Clientes>	cliente= new ArrayList<Clientes>();
	 
	public void cadastrarCliente(Clientes client) {
		if(cliente != null) {
			cliente.add(client);
		}
	}
	public void deletarCliente(Clientes client) {
		cliente.removeIf(
				(elemento)-> elemento.getNome().equals(client.getNome()));
		
	}
	
	public Clientes buscarClientes(Clientes cli) {
		for(Clientes elemento:this.cliente) {
			if(elemento.getCpf().equalsIgnoreCase(cli.getCpf()));
			return elemento;
		}
		return null;
	}
	public void editarCliente(Clientes cli) {
		int indice = cliente.indexOf(this.buscarClientes(cli));
		if(indice != -1) {
			cliente.set(indice, cli);
		}
	}
	
		
	
}