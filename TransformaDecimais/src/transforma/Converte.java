package transforma;

public class Converte {
	public String converte() {
		InformaNumero g = new InformaNumero();
		Retornos h = new Retornos();
        String result = "";
        String n = g.buscaNumero();//Retorno de num
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
        return result;
    }
}
