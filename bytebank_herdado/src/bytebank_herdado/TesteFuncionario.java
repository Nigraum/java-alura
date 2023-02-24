package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario paulo = new Gerente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222-22");
		paulo.setSalario(2600.0);
		
		System.out.println(paulo.getNome());
		System.out.println(paulo.getBonificao());
		
	}

}
