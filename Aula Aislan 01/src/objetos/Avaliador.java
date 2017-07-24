package objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Avaliador {	
 private double maiorDeTodos = Double.NEGATIVE_INFINITY;
 private double menorDeTodos = Double.POSITIVE_INFINITY;
 private List<Lance> maiores = new ArrayList<>();
 public void avalia(Leilao leilao){
	 for (Lance lance : leilao.getLances()){
		 if (lance.getValor() > maiorDeTodos){
			 maiorDeTodos = lance.getValor();
		 } if (lance.getValor() < menorDeTodos){
			 menorDeTodos = lance.getValor();
		 }
	 }	
	 pegaOsMaioresNo(leilao);
}
 private void pegaOsMaioresNo(Leilao leilao) {
	Leilao ordenaLance = leilao;
	Collections.sort(ordenaLance.getLances());
	int quantidade = 0;
	if (leilao.getLances().size() > 3){
		quantidade = 3;
	} else {
		quantidade = leilao.getLances().size();
	}
	maiores = leilao.getLances().subList(0, quantidade);
}
public List<Lance> getMaiores() {
	return maiores;
}
public double getMaiorLance() {
	return maiorDeTodos;
}
public double getMenorLance() {
	return menorDeTodos;
}
}
