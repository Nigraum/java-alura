package bytebank_encapsulado;

public class TestaGeteSetter {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		conta.setTitular(paulo);
		paulo.setNome("Paulo Silveira");
		
		System.out.println(conta.getTitular().getNome());
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		System.out.println(titularDaConta.getProfissao());
	}
}
