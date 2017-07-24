package objeto;

public class DescontoPorMaisDeCincoItens implements Desconto {
	private Desconto proximo;
	private double desconta(Orcamento orcamento){
		double resultado = 0;
		if (orcamento.getItens().size() > 5){
			return orcamento.getValor() * 0.1;
		}else{
			return proximo.desconto(orcamento);
		}
		//return resultado;
	}
@Override
public void setProximo(Desconto proximo) {
	this.proximo = proximo;
	
}
@Override
public double desconto(Orcamento orcamento) {
	// TODO Auto-generated method stub
	return 0;
}
}
