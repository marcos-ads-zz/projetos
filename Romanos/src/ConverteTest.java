import org.junit.Assert;
import org.junit.Test;


public class ConverteTest {
		
		@Test
		public void representaAlgarismosXV(){
			AlgarismosRomanos roma = new AlgarismosRomanos();
			String nr = roma.converte(15);
			
			String esperado2 = "XV";
			Assert.assertEquals(esperado2, nr);
			System.out.println("Converte");
			System.out.println(nr);	
		}
		@Test
		public void representaAlgarismosXXVIII(){
			AlgarismosRomanos roma = new AlgarismosRomanos();
			String nr = roma.converte(28);
			
			String esperado2 = "XXVIII";
			Assert.assertEquals(esperado2, nr);
			System.out.println("Converte");
			System.out.println(nr);	
		}
		@Test
		public void representaAlgarismosIV(){
			AlgarismosRomanos roma = new AlgarismosRomanos();
			String nr = roma.converte(4);
			
			String esperado2 = "IV";
			Assert.assertEquals(esperado2, nr);
			System.out.println("Converte");
			System.out.println(nr);	
		}
	}