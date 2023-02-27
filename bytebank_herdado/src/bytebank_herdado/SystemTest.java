package bytebank_herdado;

public class SystemTest {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		InternSystem si = new InternSystem();
		si.autentica(g);
	}
}
