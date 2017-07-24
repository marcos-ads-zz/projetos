package Objeto;
import java.util.List;
import java.util.ArrayList;

public class Leilao {
	String descricao;
	List<Lance> lances = new ArrayList<>();
	public Leilao(String descricao) {
		this.descricao = descricao;
	}
	public void propoe (Lance lance){
		if(lances.isEmpty() || !UltimoLanceDado().getUsuario().equals(lance.getUsuario())){
			lances.add(lance);
		}
	}
	public Lance UltimoLanceDado() {
		return lances.get(lances.size()-1);
	}
	public String getDescricao() {
		return descricao;
	}
	public List<Lance> getLances() {
		return lances;
	}

}
