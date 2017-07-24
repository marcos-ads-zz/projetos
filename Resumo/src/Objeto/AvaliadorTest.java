package Objeto;

import org.junit.Test;
import org.junit.Assert;


public class AvaliadorTest {
	@Test
	public void testandovalores(){
		Usuario neri = new Usuario("Neri");
		Usuario marcos = new Usuario("Marcos");
		Usuario junior = new Usuario("Júnior");
		
		Leilao leilao = new Leilao("Computador");
		
		leilao.propoe(new Lance(neri, 50.00));
		leilao.propoe(new Lance(marcos, 70.00));
		leilao.propoe(new Lance(junior, 100.00));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		double maiorEsperado = 100;
		double menorEsperado = 50;
		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
		System.out.println("\nEm Ordem Crescente Maior Lance-> "+leiloeiro.getMaiorLance());
	    System.out.println("Em Ordem Crescente Menor Lance-> "+leiloeiro.getMenorLance());
	}

}
