
public class NumeroPrimo {

    public static void main(String[] args) {

        //int[] numeros2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
    	int cont = 11;
        int[] numeros = new int[cont];
        
        for (int i = 0; i < cont; i++) {
			numeros[i] = i;
		}
        

        
        for(int i=0; i<numeros.length; i++){
            if(isNumeroPrimo(numeros[i])){
                System.out.print("\nNúmero " + numeros[i] + " - É PRIMO");
            } else {
                System.out.print("\nNúmero " + numeros[i] + " - NÃO É PRIMO");
            }
        }
    }

    public static boolean isNumeroPrimo(int numero){

        boolean isNumeroPrimo = false;
        int contador=0;

        for(int i=1; i<=numero; i++){
            if(numero%i==0){
                contador++;
            }
        }

        if(contador == 2){
            isNumeroPrimo = true;
        }

        return isNumeroPrimo;
    }
}
