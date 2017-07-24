
public class CalculadoraDeSalario {
	public double calcula(Funcionario funcionario){
		double teste = 0;
		if(funcionario.getSalaio() < 3000){
			double Desenvolvedor1 = 0.2;
			teste = Desenvolvedor1;
		}
		if(funcionario.getSalaio() > 3000){
			double Desenvolvedor2 = 0.1;
			teste = Desenvolvedor2;
		}
		if(funcionario.getSalaio() > 2500){
			double DBA1 = 0.25;
			teste = DBA1;
		}
		if(funcionario.getSalaio() < 2500){
			double DBA2 = 0.15;
			teste = DBA2;
		}
		if(funcionario.getSalaio() > 2500){
			double Testador1 = 0.2;
			teste = Testador1;
		}
		if(funcionario.getSalaio() < 2500){
			double Testador2 = 0.2;
			teste = Testador2;
		}
		return teste;
		}
}
