package avaliacao;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras  {
	List<Produto> produtos = new ArrayList<>();	
	public void adicionaProduto (Produto produto){
		 produtos.add(produto);
	}
	public List<Produto> getProdutos() {	
		return produtos;
	}
}
