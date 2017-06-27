package objetos;

import teste.Animal;

public class Principal {
	public static void main(String[] args){
		Pessoa objeto = new Pessoa();
		System.out.println(objeto.nome);
		
		Animal objeto2 = new Animal();
		System.out.println(objeto2.tipo);
		//Executa Metodu
		objeto2.fazerBarulho();
	}

}
