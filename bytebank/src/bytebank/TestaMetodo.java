package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoDouglas = new Conta();
		contaDoDouglas.saldo = 100;
		contaDoDouglas.deposita(50);
		System.out.println(contaDoDouglas.saldo);
		
		contaDoDouglas.saca(20);
		System.out.println(contaDoDouglas.saldo);
	}
}
