	/**
	* <h1>Banco </h1>
	*Classe que simula um 'Conta Corrente', com herança de 'Conta'
	* 
	* <b>Note:</b> Desafio "Criando um Banco Digital com Java e Orientação a Objetos" do BootCamp Santander 2024 - Backend com Java"
	* @author  Everton Moraes
	* @version 1.0
	* @since   13/07/2024
	*/
public class ContaCorrente extends Conta {

	/**
	* Este método é para construir/gerar uma Conta Corrente
	* @param cliente Nome do Cliente
	*/
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}