	/**
	* <h1>IConta</h1>
	*Interface que simula um 'IConta'
	* 
	* <b>Note:</b> Desafio "Criando um Banco Digital com Java e Orientação a Objetos" do BootCamp Santander 2024 - Backend com Java"
	* @author  Everton Moraes
	* @version 1.0
	* @since   13/07/2024
	*/
public interface IConta {
	
	/**
	* Este método realizar saque da conta
	* @param valor Valor a ser sacado
	*/
	void sacar(double valor);
	
	/**
	* Este método realizar deposito na conta
	* @param valor Valor a ser depositado
	*/
	void depositar(double valor);
	
	/**
	* Este método realizar transferencia de valores entre contas
	* @param valor Valor a ser transferido
	* @param contaDestino Conta a receber o valor
	*/
	void transferir(double valor, IConta contaDestino);
	
	/**
	* Este método imprime o Extrato da Conta 
	*/
	void imprimirExtrato();
}