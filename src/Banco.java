import java.util.List;
	/**
	* <h1>Banco </h1>
	*Classe que simula um 'Banco'
	* 
	* <b>Note:</b> Desafio "Criando um Banco Digital com Java e Orientação a Objetos" do BootCamp Santander 2024 - Backend com Java"
	* @author  Everton Moraes
	* @version 1.0
	* @since   13/07/2024
	*/
public class Banco {

	private String nome;
	private List<Conta> contas;

    /**
	* Este método é para recuperar/consultar o Nome do Banco
	* @return String Nome do Banco
	*/
	public String getNome() {
		return nome;
	}

    /**
	* Este método é para configurar o Nome do Banco
	* @param nome Nome do Banco
	*/
	public void setNome(String nome) {
		this.nome = nome;
	}

    /**
	* Este método é para recuperar/consultar as Contas existentes no Banco
	* @return List<Conta> lista de contas existentes no banco
    */
	public List<Conta> getContas() {
		return contas;
	}

    
    /**
	* Este método é para configurar as Contas existentes no Banco
	* @param contas Lista de contas
	*/ 
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}