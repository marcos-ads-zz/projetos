package Aprendendo;

import javax.swing.JOptionPane;
public class IdadeMaior {
	public static void main(String[] args) {
		String[] maiores21 = new String[5];
		for (int i = 0; i < 4; i++) {
			String nome;
			int idade;
			nome = JOptionPane.showInputDialog("Insira o nome");
			idade = Integer.parseInt(JOptionPane
					.showInputDialog("Insira a idade"));
			if (idade > 21) {
				maiores21[i] = "Nome: " + nome + "\nIdade: " + idade + "\n\n";
			}
		}
		if (maiores21[0] != null) {
			String set = "\n";
			for (int i = 0; i < maiores21.length; i++) {
				if (maiores21[i] != null)
					set += maiores21[i];
			}
			JOptionPane.showMessageDialog(null, "Maiores de 21 anos:\n" + set);
		} else {
			JOptionPane.showMessageDialog(null,
					"Não há pessoa maior de 21 anos!");
		}
	}
}
