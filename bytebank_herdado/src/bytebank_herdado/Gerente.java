package bytebank_herdado;

//Gerente é um Funcionario, Gerente herda da class FuncionarioAutenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private PasswordSys autenticador;
	
	public Gerente() {
		this.autenticador = new PasswordSys();
	}

	public double getBonificao() {
		System.out.println("O metodo de bonificação é do GERENTE");
		return super.getSalario();
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
