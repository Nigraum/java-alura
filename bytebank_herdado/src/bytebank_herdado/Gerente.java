package bytebank_herdado;

//Gerente é um Funcionario, Gerente herda da class Funcionario
public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificao() {
		System.out.println("O metodo de bonificação é do GERENTE");
		return super.getSalario();
	}
	
}
