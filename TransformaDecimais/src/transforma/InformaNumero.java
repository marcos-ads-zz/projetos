package transforma;

import javax.swing.JOptionPane;


public class InformaNumero {
    public String buscaNumero() {
    	
        String valor = JOptionPane.showInputDialog(null, "Digite um N�mero:");
        
        int n = Integer.parseInt(valor);
        if(n <= 3000){
        }else{
            JOptionPane.showMessageDialog(null,"S� converte n�meros menores que 3 mil");
        }
        return valor;
    }
    
    
    //Resultado
    public static void main(String[] args) {
    	Converte q = new Converte();
    	//System.out.println(q.seperaNumero());
    	JOptionPane.showMessageDialog(null,"O Valor Covertido �-> "+ q.converte());
    	}
} 
