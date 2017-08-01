
public class RomanosDecimal {
	public int converte(String texto) {
		int n = 0;
		int numeralDaDireita = 0;
		for (int i = texto.length() - 1; i >= 0; i--) {
			
			int valor = (int) traduzirNumeralRomano(texto.charAt(i));
			n += valor * Math.signum(valor + 0.5 - numeralDaDireita);
			numeralDaDireita = valor;
		}
		return n;
	}
	
	public void separaDecimal (String numero){
		RomanosDecimal sr = new RomanosDecimal();	
		char[] digitos = String.valueOf( numero ).toCharArray();
		int valor;
		for ( char d : digitos ) {
			String s = Character.toString(d);
		    valor = sr.converte(s);
		    System.out.print(valor + " ");
		} 
	}
	private double traduzirNumeralRomano(char caractere) {
		return Math.floor(Math.pow(10, "IXCM".indexOf(caractere))) + 5 * Math.floor(Math.pow(10, "VLD".indexOf(caractere)));
	}
}

