import org.junit.Test;

public class CalculadoraTest {
	@Test
	public void testandovalores(){
		Cargo DBA = new Cargo("DBA");
		Cargo Testador = new Cargo("Testador");
		Cargo Desenvolvedor = new Cargo("Dezenvolvedor");
		
		Funcionario Marcos = new Funcionario("Marcos", DBA, 3000);
		Funcionario Neri = new Funcionario("Neri", Testador, 2500);
		Funcionario Sousa = new Funcionario("Sousa", Desenvolvedor, 2400);
		
		
		
		System.out.printf(Neri.nome+" "+Neri.salaio+"\n");
		System.out.printf(Marcos.nome+" "+Marcos.salaio+"\n");
		System.out.printf(Sousa.nome+" "+Sousa.salaio+"\n");
		System.out.println("");
		
	}
}
