package bytebank_herdado;

public class Cliente implements Autenticavel {
	
	private PasswordSys autenticador;
	
	public Cliente() {
		this.autenticador = new PasswordSys();
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
