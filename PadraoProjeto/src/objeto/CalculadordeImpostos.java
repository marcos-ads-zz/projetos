package objeto;

public class CalculadordeImpostos {
	public void realizaCalculo(Orcamento orcamento){
		double icms = orcamento.getValor()* 0.1;
		System.out.println(icms);
	}

}
