package objetos;

public class Pessoa {
	String nome = "Marcos";
	//Somente o que estiver dentro da class pode acessar essa vari�vel
	private int senhaDoBanco = 123;
	//Metodo Pegar Senha
	public int pegarSenhaDoBanco(){
		
		return senhaDoBanco;	
	}

}
