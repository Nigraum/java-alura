package bytebank_herdado;

//Gerente é um Funcionario, Gerente herda da class Funcionario
public class Gerente extends Funcionario {
	
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
//	public double getBonificao() {
//		return this.salario;
//	}
	
}
