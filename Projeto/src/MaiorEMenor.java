import java.util.List;

public class MaiorEMenor {
	private Produto maior;
	private Produto menor;
	public void encontra (List<Produto> produtos){
		double menorValor = Double.POSITIVE_INFINITY;
		double maiorValor = Double.POSITIVE_INFINITY;
		for (Produto produto : produtos){
			if (produto.getValor() > maiorValor){
				this.maior = produto;
				maiorValor = produto.getValor();
			}
			if (produto.getValor() > menorValor){
				this.menor = produto;
				menorValor = produto.getValor();
		}
	}
	public

}
