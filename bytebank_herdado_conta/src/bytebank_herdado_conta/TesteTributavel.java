package bytebank_herdado_conta;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculoImposto calc = new CalculoImposto();
		calc.registra(cc);
		calc.registra(seguro);
		System.out.println(calc.getTotalImposto());

	}

}
