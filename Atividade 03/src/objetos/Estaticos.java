package objetos;

public class Estaticos {
	public static void main (String[] args){
		SalaDeAula.professor = "Leo";
		SalaDeAula.ensinar();
		
		SalaDeAula a1 = new SalaDeAula();
		a1.aluno = "Marcos";
		System.out.println(a1.aluno);
		System.out.println(a1.professor);
		
		SalaDeAula a2 = new SalaDeAula();
		a2.aluno = "Neri";
		System.out.println(a2.aluno);
		System.out.println(a2.professor);
	}
}
