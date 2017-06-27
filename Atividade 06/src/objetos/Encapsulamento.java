package objetos;

public class Encapsulamento {
	public static void main(String[] args){
		
		Pessoa obj = new Pessoa();
		
		obj.setNome("Marcos");
		
		System.out.println(obj.getNome());
		System.out.println(obj.getIdade());
		
	}

}
