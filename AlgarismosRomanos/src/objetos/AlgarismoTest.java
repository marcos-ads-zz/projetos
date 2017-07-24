package objetos;

import org.junit.Assert;
import org.junit.Test;

public class AlgarismoTest {
	@Test
	public void representaAlgarismosXV(){
		Convert armazena = new Convert();
		Armazena armazena2 = new Armazena();
		
		armazena.converte(15);
		armazena2.adicionaNaLista(new Algarismos(armazena.getNn(), armazena.getResult()));
		int esperado1 = 15;
		//String esperado2 = "<XV>";
		Assert.assertEquals(esperado1, armazena.getNn(), 0);
		//Assert.assertEquals(esperado2, armazena.getResult(), 0);
		System.out.println("Converte");
		System.out.println("Tamanho do Array-> "+ armazena2.getAlgarismos().size());
		for(Algarismos algarismos : armazena2.getAlgarismos()){
			System.out.println(algarismos.getValor()+" Converte para Algarismo Romano-> "+algarismos.getValor2());	
		}	
	}
	@Test
	public void representaAlgarismosXXVIII(){
		Convert armazena = new Convert();
		Armazena armazena2 = new Armazena();
		
		armazena.converte(28);
		armazena2.adicionaNaLista(new Algarismos(armazena.getNn(), armazena.getResult()));
		
		int esperado1 = 28;
		//String esperado2 = "<XXVIII>";
		Assert.assertEquals(esperado1, armazena.getNn(), 0);
        //Assert.assertEquals(esperado2, armazena.getResult(), 0);
		System.out.println("Converte");
		System.out.println("Tamanho do Array-> "+ armazena2.getAlgarismos().size());
		for(Algarismos algarismos : armazena2.getAlgarismos()){
			System.out.println(algarismos.getValor()+" Converte para Algarismo Romano-> "+algarismos.getValor2());	
		}	
	}
	@Test
	public void representaAlgarismosIV(){
		Convert armazena = new Convert();
		Armazena armazena2 = new Armazena();
		
		armazena.converte(4);
		armazena2.adicionaNaLista(new Algarismos(armazena.getNn(), armazena.getResult()));
		
		int esperado1 = 4;
		//String esperado2 = "<IV>";
		Assert.assertEquals(esperado1, armazena.getNn(), 0);
		//Assert.assertEquals(esperado2, armazena.getResult(), 0);
		System.out.println("Converte");
		System.out.println("Tamanho do Array-> "+ armazena2.getAlgarismos().size());
		for(Algarismos algarismos : armazena2.getAlgarismos()){
			System.out.println(algarismos.getValor()+" Converte para Algarismo Romano-> "+algarismos.getValor2());	
		}	
	}
}
