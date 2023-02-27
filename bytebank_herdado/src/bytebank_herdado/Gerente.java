package bytebank_herdado;

//Gerente é um Funcionario, Gerente herda da class FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {
	
	public double getBonificao() {
		System.out.println("O metodo de bonificação é do GERENTE");
		return super.getSalario();
	}
	
}
