package objetos;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
		String descricao;
		List<ProdutoAdicionado> produto = new ArrayList<>();
		public CarrinhoDeCompras(String descricao) {
			this.descricao = descricao;
		}
		public void carrinho (ProdutoAdicionado produto){
			if(produto.isEmpty() || !UltimoProdutoAdicionado().getProduto().equals(produto.getProduto())){
				produto.add(produto);
			}
		}
		public ProdutoAdicionado UltimoProdutoAdicionado() {
			return produto.get(produto.size()-1);
		}
		public String getDescricao() {
			return descricao;
		}
		public List<ProdutoAdicionado> getCliente() {
			return produto;
		}

	}