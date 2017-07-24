package objetos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LeilaoTest {
	 @Test
	    public void naoDeveAceitarDoisSeguidosDoMesmoUsuario() {
		//Cenário
		Leilao leilao = new Leilao("Notebook");
		Usuario Marcos = new Usuario("Marcos");

		Leilao.propoe(new Lance(Marcos, 20000.00));
		Leilao.propoe(new Lance(Marcos, 30000.00));

	    //Saida Resultado
	    assertEquals(1, leilao.getLances().size());
	    assertEquals(20000, leilao.getLances().get(0).getValor(), 0.00001);

}
	 public void naodeve(){
		    Leilao leilao = new Leilao("Notbook");
			Usuario Marcos = new Usuario("Marcos");
			Usuario Neri = new Usuario("Neri");
			Leilao.propoe(new Lance(Marcos, 205.00));
			Leilao.propoe(new Lance(Neri  , 300.00));
			Leilao.propoe(new Lance(Marcos, 205.00));
			Leilao.propoe(new Lance(Neri  , 300.00));
			Leilao.propoe(new Lance(Marcos, 205.00));
			Leilao.propoe(new Lance(Neri  , 300.00));
			Leilao.propoe(new Lance(Marcos, 205.00));
			Leilao.propoe(new Lance(Neri  , 300.00));
			Leilao.propoe(new Lance(Marcos, 205.00));
			Leilao.propoe(new Lance(Neri  , 1000.00));
			//N
			Leilao.propoe(new Lance(Neri, 12000.00));
			
			assertEquals(10, leilao.getLances().size());
			int ultimo = leilao.getLances().size() -1;
			assertEquals(1000.0, leilao.getLances().get(ultimo).getValor(), 0.00001);
	 }
}