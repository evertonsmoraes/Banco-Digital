	/**
	* <h1>Cliente </h1>
	*Classe que simula um 'Cliente'
	* 
	* <b>Note:</b> Desafio "Criando um Banco Digital com Java e Orientação a Objetos" do BootCamp Santander 2024 - Backend com Java"
	* @author  Everton Moraes
	* @version 1.0
	* @since   13/07/2024
	*/
public class Cliente {

	private String nome;

	/**
	* Este método é para recuperar/consultar o Nome do Cliente
	* @return String o resultado deste método é o Nome do Cliente
	*/
	public String getNome() {
		return nome;
	}

	/**
	* Este método é para configurar o Nome do Cliente
	* @param nome Nome do Cliente
	*/
	public void setNome(String nome) {
		this.nome = nome;
	}

}