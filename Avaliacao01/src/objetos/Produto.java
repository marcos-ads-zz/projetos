package objetos;

public class Produto {
	String nome;
	double valor;
	public Produto(String nome){
		this.nome = nome;
	}
	public Produto(String nome, double valor){
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
	return nome;
	}
	public double getValor() {
	return valor;
	}
}