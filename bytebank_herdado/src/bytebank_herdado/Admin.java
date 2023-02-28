package bytebank_herdado;

public class Admin extends Funcionario implements Autenticavel {
	
	private PasswordSys autenticador;
	
	public Admin() {
		this.autenticador = new PasswordSys();
	}
	
	@Override
	public double getBonificao() {
		
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
