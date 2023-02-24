package bytebank_herdado;

//Gerente é um Funcionario, Gerente herda da class Funcionario
public class Designer extends Funcionario {
	
	
	
	public double getBonificao() {
		System.out.println("O metodo de bonificação do DESIGNER");
		return 200;
	}
	
}
