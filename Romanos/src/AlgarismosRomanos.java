
public class AlgarismosRomanos {
	private String romanos[] = {"CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	private int numeros[] = {900,500,400,100,90,50,40,10,9,5,4,1};
	public String converte(int num){
		String result = "";
		int conte;
		for (int i = 0; i < numeros.length; i++) {
			conte = num/numeros[i];
			for (int j = 0; j < conte; j++) {
				result+=romanos[i];
			}
			num = num%numeros[i];
		}
		return result;
	}
	
}
