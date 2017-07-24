package Objeto;

public class Usuario {
	int id;
	String nome;
	public Usuario(String nome){
		this.nome = nome;
	}
	public Usuario(int id, String nome){
		this.id = id;
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}

}
