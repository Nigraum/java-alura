package bytebank_herdado;

public class SystemTest {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Admin adm = new Admin();
		adm.setSenha(3333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(222);
		
		InternSystem si = new InternSystem();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
	}
}
