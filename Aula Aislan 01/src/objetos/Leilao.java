package objetos;
import java.util.ArrayList;
import java.util.List;

public class Leilao {
	String descricao;
	static List<Lance> lances = new ArrayList<Lance>();
	public Leilao(String descricao){
		this.descricao = descricao;
		}
		public static void propoe (Lance lance){
			int total = 0;
			for (Lance l : lances){
				if (l.getUsuario().equals(lance.getUsuario())){
					total++;
				}
				if(lances.isEmpty() || !ultimoLance().getUsuario().equals(lance.getUsuario()) && total > 5) {
				lances.add(lance);
			    }  
			}
			System.out.println(lances.add(lance));		
		}
		private static Lance ultimoLance() {
			return lances.get(lances.size() - 1);
		}
		public String getDescricao(){
			return descricao;	
		}
		public List<Lance> getLances(){
			return lances;
		}
	}

