package bytebank_herdado_conta;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
}
