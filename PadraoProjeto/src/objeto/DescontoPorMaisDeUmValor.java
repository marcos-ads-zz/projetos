package objeto;

public class DescontoPorMaisDeUmValor implements Desconto{
	private Desconto proximo;
	@Override
	public double desconto(Orcamento orcamento) {
		if(orcamento.getValor() > 500){
			return orcamento.getValor() * 0.7;
		}else{
			return proximo.desconto(orcamento);
		}

	}
	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
