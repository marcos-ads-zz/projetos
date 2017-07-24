package Objeto;

public class Lance {
	Usuario usuario;
	double valor;
	public Lance(Usuario usuario, double valor){
		this.usuario = usuario;
		this.valor = valor;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public double getValor() {
		return valor;
	}

}
