
public class TesteMaiorMenor {
	public static void main(String[] args){
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionarProduto(new Produto("caneta", 3));
		c.adicionarProduto(new Produto("Copo", 12));
		c.adicionarProduto(new Produto("Camisa", 100));
		c.adicionarProduto(new Produto("Celular", 500));
		MaioreMenor mm = new MaioreMenor();
		mm.encontra(c.getProdutos());
		System.out.println("maior: "+mm.getMaior().nome);
		System.out.println("menor: "+mm.getMenor().nome);
		
	}

}
