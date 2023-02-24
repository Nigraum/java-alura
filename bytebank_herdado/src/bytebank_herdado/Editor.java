package bytebank_herdado;

//Gerente é um Funcionario, Gerente herda da class Funcionario
public class Editor extends Funcionario {
	
	
	
	public double getBonificao() {
		return super.getBonificao() + 100;
	}
	
}
