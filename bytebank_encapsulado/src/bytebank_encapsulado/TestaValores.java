package bytebank_encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 3214);
		System.out.println(conta2.getAgencia());
		
		System.out.println("O total de contas é: " + Conta.getTotal());
	}
}
