import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {
		@Test
		public void representaAlgarismosXV(){
			AlgarismosRomanos roma = new AlgarismosRomanos();
			String nr = roma.converte(15);
			
			String esperado2 = "XV";
			Assert.assertEquals(esperado2, nr);
			//System.out.println(nr);	
		}
		@Test
		public void representaAlgarismosXXVIII(){
			AlgarismosRomanos roma = new AlgarismosRomanos();
			String nr = roma.converte(28);
			
			String esperado2 = "XXVIII";
			Assert.assertEquals(esperado2, nr);
			//System.out.println(nr);	
		}
		@Test
		public void representaAlgarismosIV(){
			AlgarismosRomanos roma = new AlgarismosRomanos();
			String nr = roma.converte(4);
			
			String esperado2 = "IV";
			Assert.assertEquals(esperado2, nr);
			//System.out.println(nr);	
		}
//===========================================================================
		@Test
		public void representaAlgarismos15(){
			AlgarismosRomanos roma = new AlgarismosRomanos();
			String nr = roma.converte2("XV");
			
			String esperado2 = "XV";
			System.out.println(nr);
			Assert.assertEquals(esperado2, nr);
				
		}
		@Test
		public void representaAlgarismos28(){
			AlgarismosRomanos roma = new AlgarismosRomanos();
			String nr = roma.converte(28);
			
			String esperado2 = "XXVIII";
			Assert.assertEquals(esperado2, nr);
			//System.out.println(nr);	
		}
		@Test
		public void representaAlgarismos4(){
			AlgarismosRomanos roma = new AlgarismosRomanos();
			String nr = roma.converte(4);
			
			String esperado2 = "IV";
			Assert.assertEquals(esperado2, nr);
			//System.out.println(nr);	
		}
}