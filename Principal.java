package banco;

public class Principal {

	public static void main(String[] args) {
//		____________________
		Gerente paulo = new Gerente("Paulo","13231");
		Gerente maria = new Gerente("Maria");
		ListaGerente lista1 = new ListaGerente();
//		_____________________
		Clientes luiz = new Clientes("Luiz","53232");
		Clientes lais = new Clientes("4354");
		ListaClientes lista2 = new ListaClientes();
//		______________________
		Funcionarios murilo = new Funcionarios("Murilo","4343");
		Funcionarios thiago = new Funcionarios("563576");
		ListaFuncionarios lista3 = new ListaFuncionarios();
//		______________________
		lista1.cadastarGerente(paulo);
		lista2.cadastrarCliente(luiz);
		lista3.cadastrarFuncionario (murilo);
//		______________________
		Gerente busca = lista1.buscarGerente(maria);
		
		if(busca == null) {
			System.out.println("Gerente não localizado");
		}else {
			System.out.printf("%s localizado",busca.getNome());
	}
//	___________________________
		Clientes busca2= lista2.buscarClientes(luiz);
		
		if(busca2== null) {
			System.out.println("Gerente não localizado");
		}else {
			System.out.printf("%s localizado",busca2.getNome());
		}
// 		________________________
		Funcionarios busca3 = lista3.buscarFunc(murilo);
		
		if(busca3== null) {
			System.out.println("Gerente não localizado");
		}else {
			System.out.printf("%s localizado",busca3.getNome());
		}
		
		
		
		
		
		
		
		
		lista1.deletar(paulo);
		lista2.deletarCliente(lais);
		lista3.deletar(thiago);
	}
 
		
		

		
		
		
	

}
