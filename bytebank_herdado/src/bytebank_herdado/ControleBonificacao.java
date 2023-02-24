package bytebank_herdado;

public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Gerente g) {
		double boni = g.getBonificao();
		this.soma = this.soma + boni;
	}
	
	public void registra(Funcionario f) {
		double boni = f.getBonificao();
		this.soma = this.soma + boni;
	}
	
	public void registra(Editor ev) {
		double boni = ev.getBonificao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
