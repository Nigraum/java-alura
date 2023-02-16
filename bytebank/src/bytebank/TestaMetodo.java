package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoDouglas = new Conta();
		contaDoDouglas.saldo = 100;
		contaDoDouglas.deposita(50);
		System.out.println(contaDoDouglas.saldo);
		
		contaDoDouglas.saca(20);
		System.out.println(contaDoDouglas.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(500, contaDoDouglas);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoDouglas.saldo);
		
		contaDoDouglas.titular = "Douglas Costa";
		System.out.println(contaDoDouglas.titular);
	}
}
