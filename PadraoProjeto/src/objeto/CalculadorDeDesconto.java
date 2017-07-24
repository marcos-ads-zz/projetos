package objeto;

public class CalculadorDeDesconto {
	public double calcula(Orcamento orcamento){
		Desconto d1 = new DescontoPorMaisDeCincoItens();
		Desconto d2 = new DescontoPorMaisDeUmValor();
		Desconto d3 = new SemDesconto();
		d1.setProximo(d2);
		d2.setProximo(d3);
		return d1.desconto(orcamento);
	}


}
