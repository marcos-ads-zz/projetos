package objetos;

public class Lance implements Comparable<Lance> {
	Usuario usuario;
	double valor;
	public Lance(Usuario usuario, double valor) {
		this.usuario = usuario;
		this.valor = valor;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public double getValor() {
		return valor;
	}
	@Override
	public int compareTo(Lance lance) {
		if (lance.getValor()>this.getValor()){
			return  1;
		}
		if (lance.getValor()<this.getValor()){
			return  -1;
		} 
		return 0;
	}
}
