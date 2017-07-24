package objetos;
import javax.swing.JOptionPane;

public class ConverteDecimal {
	    int saida = 0;
	    public String buscaNumero() {
	        String num = JOptionPane.showInputDialog(null, "Entre com o Número:");
	        return num;
	    }
	    public int transformaDecimal_10(String num) {
	        int contaNum = num.length();
	        String stNum = num.substring(0, 1);
	        String stNum2;
	        if (contaNum == 2) {
	            stNum2 = num.substring(1, 2);
	        } else {
	            stNum2 = "";
	        }
	        if (stNum.equalsIgnoreCase("I")) {
	            saida = contaNum;
	            if (stNum2.equalsIgnoreCase("V")) {
	                saida = 4;
	            } else if (stNum2.equalsIgnoreCase("X")) {
	                saida = 9;
	            }
	        }
	        if (stNum.equalsIgnoreCase("V")) {
	            saida = 5;
	        }
	        if (stNum.equalsIgnoreCase("V")) {
	            int cont = 1;
	            int cont2 = 2;
	            for (int i = 6; i < (contaNum + 5); i++) {
	                stNum2 = num.substring(cont, cont2);
	                if (stNum2.equalsIgnoreCase("I")) {
	                    saida = i;
	                }
	                cont++;
	                cont2++;
	            }
	        }
	        return saida;
	    }
	    public int transformaDecimal_100(String num) {
	        int contaNum = num.length();
	        String stNum = num.substring(0, 1);
	        String stNum2;
	        if (contaNum == 2) {
	            stNum2 = num.substring(1, 2);
	        } else {
	            stNum2 = "";
	        }
	        if (stNum.equalsIgnoreCase("X")) {
	            saida = contaNum * 10;
	            if (stNum2.equalsIgnoreCase("L")) {
	                saida = 40;
	            } else if (stNum2.equalsIgnoreCase("C")) {
	                saida = 90;
	            }
	        }
	        if (stNum.equalsIgnoreCase("L")) {
	            saida = 50;
	        }
	        if (stNum.equalsIgnoreCase("L")) {
	            int cont = 1;
	            int cont2 = 2;
	            for (int i = 6; i < (contaNum + 50); i++) {
	                stNum2 = num.substring(cont, cont2);
	                if (stNum2.equalsIgnoreCase("X")) {
	                    saida = i * 10;
	                }
	                cont++;
	                cont2++;
	            }
	        }
	        return saida;
	    }
	    public static void main(String[] args) {
	    	ConverteDecimal q = new ConverteDecimal();
	        System.out.println(q.transformaDecimal_100(q.buscaNumero()));
	    }
}

