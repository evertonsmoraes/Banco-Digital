    /**
	* <h1>Banco </h1>
	*Classe que simula ações em um 'Banco'
	* 
	* <b>Note:</b> Desafio "Criando um Banco Digital com Java e Orientação a Objetos" do BootCamp Santander 2024 - Backend com Java"
	* @author  Everton Moraes
	* @version 1.0
	* @since   13/07/2024
	*/
public class Main {

	/**
	* Este método simula ações em um 'Banco':
	* (1) Criação de um Cliente
	* (2) Criação de uma Conta Corrente
	* (3) Criação de uma Conta Poupança
	* (4) Deposito na Conta Corrente
	* (5) Transferência da Conta Corrente para a Conta Poupança
	* (6) Impressão do Extrato da Conta Corrente
	* (7) Impressão do Extrato da Conta Poupança
	* @param valor Valor a ser sacado
	*/
	public static void main(String[] args) {
		Cliente everton = new Cliente();
		everton.setNome("Everton");
		
		Conta cc = new ContaCorrente(everton);
		Conta poupanca = new ContaPoupanca(everton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}