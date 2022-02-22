
public class ContaCorrente {

	private String nome;
	private double saldo;
	private int numero;

	public void sacar(double valor) {
		saldo = this.saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo = this.saldo + valor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		this.saldo = d;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int cpf) {
		this.numero = cpf;
	}

}
