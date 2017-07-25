package objetos;

import java.util.ArrayList;
import java.util.List;

public class Armazena {
	List<Algarismos> algarismos = new ArrayList<>();
	public void adicionaNaLista(Algarismos algarismo){
		algarismos.add(algarismo);
	}
	public List<Algarismos> getAlgarismos() {	
		return algarismos;
	}
}
