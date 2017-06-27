package objetos;

public class Teste {
	public static void main(String[] args){
		Cachorro cao = new Cachorro();
		cao.peso = 75;
		cao.raca = "Viralata";
		cao.durmir();
		System.out.println(cao.raca);
		System.out.println(cao.peso);
		
		Cachorro galinha = new Cachorro();
		galinha.peso = 25;
		galinha.raca = "Sei Lá";
		galinha.durmir();
		System.out.println(galinha.raca);
		System.out.println(galinha.peso);
	}

}
