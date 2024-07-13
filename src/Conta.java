	/**
	* <h1>Conta</h1>
	*Classe Abstrata que simula um 'Conta', implementando interface 'IConta'
	* 
	* <b>Note:</b> Desafio "Criando um Banco Digital com Java e Orientação a Objetos" do BootCamp Santander 2024 - Backend com Java"
	* @author  Everton Moraes
	* @version 1.0
	* @since   13/07/2024
	*/
	
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	/**
	* Este método é para construir/gerar uma Conta
	* @param cliente Nome do Cliente
	*/
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	/**
	* Este método é para recuperar/consultar a Agência da Conta
	* @return int número da Agência da Conta
	*/
	public int getAgencia() {
		return agencia;
	}

	/**
	* Este método é para recuperar/consultar a Número da Conta
	* @return int número da Número da Conta
	*/
	public int getNumero() {
		return numero;
	}

	/**
	* Este método é para recuperar/consultar o Saldo Atual da Conta
	* @return double Saldo Atual da Conta
	*/
	public double getSaldo() {
		return saldo;
	}

	/**
	* Este método é para exibir/imprimir as informações Comuns da Conta (Nome do Titular, Agência, Número, Saldo Atual)
	*/
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}