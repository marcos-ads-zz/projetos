package transforma;

public class Retornos {
	public String retorna9(int num) {
        String numSt = new String();
        if (num <= 3) {//Se o Número For Menor ou Igual a 3.
            for (int i = 0; i < num; i++) {
            	if (num > i) {
                    numSt += "I";
                }
            }
        } else if (num >= 5 && num < 9) {//Se o Número For Maior ou Menor que 9.
            if (num == 5) {
                numSt = "V";
                } else {//Se o Número For Menor ou Igual a 3.
                	numSt = "V";
                	for (int i = 5; i < num; i++) {
                		if (num > i) {
                			numSt += "I";
                			}
                		}
                	}
            } else if (num == 4) {
            	numSt = "IV";
            	} else {
            		numSt = "IX";
            		}
        return numSt;
        }
	public String retorna99(int num) {
        String numSt = new String();
        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                if (num > i) {
                    numSt += "X";
                }
            }
        } else if (num >= 5 && num < 9) {
            if (num == 5) {
                numSt = "L";
            } else {
                numSt = "L";
                for (int i = 5; i < num; i++) {
                    if (num > i) {
                        numSt += "X";
                    }
                }
            }
        } else if (num == 4) {
            numSt = "XD";
        } else {
            numSt = "XC";
        }
        return numSt;
    }
    public String retorna999(int num) {
        String numSt = new String();
        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                if (num > i) {
                    numSt += "C";
                }
            }
        } else if (num >= 5 && num < 9) {
            if (num == 5) {
                numSt = "D";
            } else {
                numSt = "D";
                for (int i = 5; i < num; i++) {
                    if (num > i) {
                        numSt += "M";
                    }
                }
            }
        } else if (num == 4) {
            numSt = "CD";
        } else {
            numSt = "CM";
        }
        return numSt;
    }
    public String retorna3(int num) {
        String numSt = new String();
        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                if (num > i) {
                    numSt += "M";
                }
            }
        }
        return numSt;
    }

}
