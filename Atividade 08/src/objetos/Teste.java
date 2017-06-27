package objetos;
// Sobrescrita de Métodos
public class Teste {
	public static void barulho(Animal animal){
		animal.fazerBarulho();
	}
	
	public static void main(String[] args){
		Cachorro cao = new Cachorro();
		cao.fazerBarulho();
		
		Galinha galinha = new Galinha();
		galinha.fazerBarulho();
		
		barulho(cao);
		barulho(galinha);	
	}

}
