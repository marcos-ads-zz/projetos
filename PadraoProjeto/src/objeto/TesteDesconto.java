package objeto;

public class TesteDesconto {
	public static void main(String[] args){
		CalculadorDeDesconto c = new CalculadorDeDesconto();
		Orcamento o = new Orcamento(500.0);
		o.adicionaItem(new Item("Caneta", 250.0));
		o.adicionaItem(new Item("Lapis", 250.0));
		double desconto = c.calcula(0);
		System.out.println(desconto);
		
	}

}
