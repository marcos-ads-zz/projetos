package objetos;

public class Sobrecarga {
	String nome;
	int idade;
	
	//Sobrecarga de Contrutor
	Sobrecarga(String nome){
		this.nome = nome;
	}
	Sobrecarga(String nome, int idade){
		this(nome);
		this.idade = idade;	}
	
	//Sobrecarga de Metodos
	int somar(int n1, int n2){
		return n1+n2;
	}
	int somar(int n1, int n2, int n3){
		return this.somar(n1, n2) + n3;
	}
	public static void main(String[] args){
		//Staciado abaixo
		Sobrecarga objeto = new Sobrecarga("Marcos", 29);
		int soma = objeto.somar(50, 80, 50);
		System.out.println(soma);
		System.out.println(objeto.nome);
		System.out.println(objeto.idade);
	}

}
