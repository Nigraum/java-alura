package bytebank_herdado;

//Gerente é um Funcionario, Gerente herda da class Funcionario
public class Editor extends Funcionario {
	
	
	
	public double getBonificao() {
		System.out.println("O metodo de bonificação do EDITOR");
		return 100;
	}
	
}
