package objetos;

public class Convert {
	String result = "";
	int nn;
	String n;
	VerificaAlgarismos h = new VerificaAlgarismos();
	Armazena a = new Armazena();
	public void converte(int nus) {
		nn = nus;
		n = Integer.toString(nus);
		int contNumero = n.length();
        if (contNumero == 1) {
        	int num = Integer.parseInt(n.substring(0, 1));
        	result = h.retorna9(num);
                } else if (contNumero == 2) {
                	int num = Integer.parseInt(n.substring(0, 1));
                    int num2 = Integer.parseInt(n.substring(1, 2));
                    result = h.retorna99(num) + h.retorna9(num2);
                    } else if (contNumero == 3) {
                    	int num = Integer.parseInt(n.substring(0, 1));
                        int num2 = Integer.parseInt(n.substring(1, 2));
                        int num3 = Integer.parseInt(n.substring(2, 3));
                        result = h.retorna999(num) + h.retorna99(num2) + h.retorna9(num3);
                        } else {
                        	int num = Integer.parseInt(n.substring(0, 1));
                        	int num2 = Integer.parseInt(n.substring(1, 2));
                        	int num3 = Integer.parseInt(n.substring(2, 3));
                        	int num4 = Integer.parseInt(n.substring(3, 4));
                        	result = h.retorna3(num) + h.retorna999(num2) + h.retorna99(num3) + h.retorna9(num4);
                        	}
        //System.out.println(result);
        //System.out.println(nn);
        }
	public String getResult() {
		return result;
	}
	public int getNn() {
		return nn;
	}
	
	
}
