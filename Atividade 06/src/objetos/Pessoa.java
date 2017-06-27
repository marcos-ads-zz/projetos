package objetos;
//Getters e Setters, encapsulando os atributos
public class Pessoa {
	private String  nome = "Marcos";
	
	
	public String getNome(){
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome){
		this.nome = nome;	
	}
	
	private int idade = 25;

}
