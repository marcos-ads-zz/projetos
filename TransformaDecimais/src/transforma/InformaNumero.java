package transforma;

import javax.swing.JOptionPane;


public class InformaNumero {
    public String buscaNumero() {
    	
        String valor = JOptionPane.showInputDialog(null, "Digite um Número:");
        
        int n = Integer.parseInt(valor);
        if(n <= 3000){
        }else{
            JOptionPane.showMessageDialog(null,"Só converte números menores que 3 mil");
        }
        return valor;
    }
    
    
    //Resultado
    public static void main(String[] args) {
    	Converte q = new Converte();
    	//System.out.println(q.seperaNumero());
    	JOptionPane.showMessageDialog(null,"O Valor Covertido é-> "+ q.converte());
    	}
} 
