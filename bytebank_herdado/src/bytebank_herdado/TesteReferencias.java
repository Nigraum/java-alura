package bytebank_herdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setSalario(5000.0);
		
		Editor ev = new Editor();
		ev.setSalario(2500.0);
		
		Designer d1 = new Designer();
		d1.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
	}
}
