package objetos;
import org.junit.Test;
import org.junit.Assert;

public class AvaliadorTest {
		//Metodo de Teste
		@Test
		public void devemEntenderLancesEmOrdemCrecente() {
		//Cenário
		Usuario Marcos = new Usuario("Marcos");
		Usuario Joao = new Usuario("Joao");
		Usuario Sousa = new Usuario("Sousa");
		Leilao leilao = new Leilao("Benga Esportiva 01");
		Leilao.propoe(new Lance(Marcos, 50.00));
		Leilao.propoe(new Lance(Joao  , 60.00));
		Leilao.propoe(new Lance(Sousa , 100.00));
		//Acão
    	Avaliador leiloeiro = new Avaliador();
    	leiloeiro.avalia (leilao);

    	double maiorEsperado = 100.00;
    	double menorEsperado = 50.00;
    	//Saida Resultado
    	System.out.println("\nDevem Entender Lances em Ordem Crescente\n");
    	Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(),0.00001);
		Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(),0.00001);
        System.out.println("Em Ordem Crescente Maior Lance-> "+leiloeiro.getMaiorLance());
        System.out.println("Em Ordem Crescente Menor Lance-> "+leiloeiro.getMenorLance());
        System.out.println(leiloeiro.getMaiorLance()==maiorEsperado);
        System.out.println(leiloeiro.getMenorLance()==menorEsperado);
    }//Metodo de Teste
    @Test
	public void devemEntenderLancesEmOrdemDecrecente() {
    	//Cenário
    	Usuario Marcos = new Usuario("Marcos");
    	Usuario Joao = new Usuario("Joao");
    	Usuario Sousa = new Usuario("Sousa");
    	Usuario Neri = new Usuario("Neri");
    	Leilao leilao = new Leilao("Benga Esportiva 02");
    	Leilao.propoe(new Lance(Marcos, 50.00));
    	Leilao.propoe(new Lance(Joao  , 40.00));
    	Leilao.propoe(new Lance(Sousa , 30.00));
    	Leilao.propoe(new Lance(Neri  , 20.00));
    	//Acão
    	Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia (leilao);
		double maiorEsperado = 50.00;
		double menorEsperado = 20.00;
		//Saida Resultado
		System.out.println("\nDevem Entender Lances em Orden Decrescente\n");
		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		System.out.println("Em Ordem Decrescente Maior Lance-> "+leiloeiro.getMaiorLance());
		System.out.println("Em Ordem Decrescente Menor Lance-> "+leiloeiro.getMenorLance());
		System.out.println(leiloeiro.getMaiorLance()==maiorEsperado);
		System.out.println(leiloeiro.getMenorLance()==menorEsperado);
	}
	//Metodo de Teste
	@Test
	public void devemEntenderLancesSemOrdem() {
	//Cenário
	Usuario Marcos = new Usuario("Marcos");
	Usuario Joao = new Usuario("Joao");
	Usuario Sousa = new Usuario("Sousa");
	Usuario Neri = new Usuario("Neri");
	Leilao leilao = new Leilao("Benga Esportiva 03");
	Leilao.propoe(new Lance(Marcos, 300.00));
	Leilao.propoe(new Lance(Joao, 500.00));
	Leilao.propoe(new Lance(Sousa, 700.00));
	Leilao.propoe(new Lance(Neri, 200.00));
	//Acão
	Avaliador leiloeiro = new Avaliador();
	leiloeiro.avalia (leilao);
    double maiorEsperado = 700.00;
	double menorEsperado = 200.00;
	//Saida Resultado
	System.out.println("\nDevem Entender Lances em Ordem\n");
	Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
	Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
	System.out.println("Sem Ordem Maior Lance-> "+leiloeiro.getMaiorLance());
	System.out.println("Sem Ordem Menor Lance-> "+leiloeiro.getMenorLance());
	System.out.println(leiloeiro.getMaiorLance()==maiorEsperado);
	System.out.println(leiloeiro.getMenorLance()==menorEsperado);
	}
	//Metodo de Teste
	@Test
	public void devemEntenderUmLances() {
	//Cenário
	Usuario Marcos = new Usuario("Marcos");
	Leilao leilao = new Leilao("Benga Esportiva 05");
	Leilao.propoe(new Lance(Marcos, 205.00));
	//Ação
	Avaliador leiloeiro = new Avaliador();
	leiloeiro.avalia (leilao);
    double maiorEsperado = 205.00;
	double menorEsperado = 205.00;
	//Saida Resultado
	System.out.println("\nDevem Entender um Lance\n");
	Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
	Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
	System.out.println("Um Valor Disponível Maior Lance-> "+leiloeiro.getMaiorLance());
	System.out.println("Um Valor Disponível Menor Lance-> "+leiloeiro.getMenorLance());
	System.out.println(leiloeiro.getMaiorLance()==maiorEsperado);
	System.out.println(leiloeiro.getMenorLance()==menorEsperado);
	}
	@Test
	public void retornaOsTresMaiores() {
	//Cenário
		Usuario Marcos = new Usuario("Marcos");
		Usuario Joao = new Usuario("Joao");
		Usuario Sousa = new Usuario("Sousa");
		Usuario Neri = new Usuario("Neri");
		
		Leilao leilao = new Leilao("Benga Esportiva 04");
		
		Leilao.propoe(new Lance(Marcos, 50.00));
		Leilao.propoe(new Lance(Joao, 60.00));
		Leilao.propoe(new Lance(Sousa, 100.00));
		Leilao.propoe(new Lance(Neri, 120.00));
		//Acão
	    Avaliador leiloeiro = new Avaliador();
	    leiloeiro.avalia (leilao);

	    //Saida Resultado
	    System.out.println("\nRetorna os Três Maiores\n");
	    Assert.assertEquals(3, leiloeiro.getMaiores().size());
		for(Lance lance : leiloeiro.getMaiores()){
			System.out.println(lance.getValor());
			/*
	    assertEquals(3, leiloeiro.getMaiorres(), size());
	    assertEquals(3, leiloeiro.getMaiorLance(), 0.00001);
	    for (Lance lance : leiloeiro.getMaiores()){
		  //System.out.println(getValor());*/
	    }
	}
}
