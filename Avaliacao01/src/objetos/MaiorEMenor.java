package objetos;


public class MaiorEMenor {
		private double maior = Double.NEGATIVE_INFINITY;
		private double menor = Double.POSITIVE_INFINITY;
		public void teste(Produto produto){
			
			for(ProdutoAdicionado dados : produto.getValor()){
				if(produto.getValor() > maiorDeTodos){
					maiorDeTodos = lance.getValor();
				}if(lance.getValor() < menorDeTodos){
					menorDeTodos = lance.getValor();
				}
			}	
		}
	public double getMaior() {
		return maior;
	}
	public double getMenor() {
		return menor;
	}
	}


