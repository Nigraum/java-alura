package bytebank_herdado;

public class InternSystem {
	private int senha = 222;
	
	public void autentica(Funcionario g) {
		boolean autenticou = g.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Senha incorrenta");
		}
	}
}
