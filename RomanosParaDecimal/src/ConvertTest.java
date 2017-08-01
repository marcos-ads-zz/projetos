import org.junit.Assert;
import org.junit.Test;
	public class ConvertTest {
		@Test
		public void representaAlgarismosXV(){
			RomanosDecimal nr = new RomanosDecimal();	
			int nr2 = nr.converte("XV");
			nr.separaDecimal("XV");
			int esperado2 = 15;
			Assert.assertEquals(esperado2, nr2);
			System.out.println(" = "+nr2);	
	}
		@Test
		public void representaAlgarismosXXVIII(){
			RomanosDecimal nr = new RomanosDecimal();	
			int nr2 = nr.converte("XXVIII");
			nr.separaDecimal("XXVIII");
			int esperado2 = 28;
			Assert.assertEquals(esperado2, nr2);
			System.out.println(" = "+nr2);	
	}
		@Test
		public void representaAlgarismosIV(){
			RomanosDecimal nr = new RomanosDecimal();	
			int nr2 = nr.converte("IV");
			nr.separaDecimal("IV");
			int esperado2 = 4;
			Assert.assertEquals(esperado2, nr2);
			System.out.println(" = "+nr2);	
	}	
}
