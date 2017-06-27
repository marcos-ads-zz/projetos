package objetos;
//private, modificador de acesso privado
public class Privado {
	public static void main (String[] args){
		Pessoa eu = new Pessoa();
		System.out.println(eu.nome);
		System.out.println(eu.pegarSenhaDoBanco());
	}

}
