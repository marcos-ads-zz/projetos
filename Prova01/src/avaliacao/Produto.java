package avaliacao;

public class Produto implements Comparable<Produto>{
	String nome;
	double valor;
	int teste;

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
	@Override
	public int compareTo(Produto o) {
			if (o.getValor() > this.getValor()){
				return  -1;
			}
			if (o.getValor() < this.getValor()){
				return  1;
			} 
		return 0;
	}
}