package bytebank_herdado;

//Gerente é um Funcionario, Gerente herda da class FuncionarioAutenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;

	public double getBonificao() {
		System.out.println("O metodo de bonificação é do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
}
