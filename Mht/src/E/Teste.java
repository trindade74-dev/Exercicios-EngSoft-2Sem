package E;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		
		JOptionPane.showInputDialog("Matheus Trindade RA: 0028986");
		String escolha = JOptionPane.showInputDialog("Escolha uma opção" + "\n (1) Adição" + "\n (2) Subtração" + "\n (3) Multiplicação" + "\n (4) Divisao" + "(5) Média");

		int option = Integer.parseInt(escolha);


		switch(option) {
		case 1:
			String n1 = JOptionPane.showInputDialog("Adição" + "\n Digite N1");
			int nu1 = Integer.parseInt(n1);
			String n2 = JOptionPane.showInputDialog("Adição" + "\n Digite N2");
			int nu2 = Integer.parseInt(n2);
			float soma = (nu1 + nu2);
			 JOptionPane.showInputDialog("Resultado" + "\n" + soma );
				break;

		case 2:
			String s1 = JOptionPane.showInputDialog("Subtração" + "\n Digite N1");
			int su1 = Integer.parseInt(s1);
			String s2 = JOptionPane.showInputDialog("Subtração" + "\n Digite N2");
			int su2 = Integer.parseInt(s2);
			float sub = (su1 - su2);
			JOptionPane.showInputDialog("Resultado" + "\n" + sub );
			   break;

		case 3:
			String m1 = JOptionPane.showInputDialog("Multiplicação" + "\n Digite N1");
			int mu1 = Integer.parseInt(m1);
			String m2 = JOptionPane.showInputDialog("Multiplicação" + "\n Digite N2");
			int mu2 = Integer.parseInt(m2);
			float mul = (mu1 * mu2);
			JOptionPane.showInputDialog("Resultado" + "\n" + mul );
			   break;

		case 4:
			String d1 = JOptionPane.showInputDialog("Divisão" + "\n Digite N1");
			int du1 = Integer.parseInt(d1);
			String d2 = JOptionPane.showInputDialog("Divisão" + "\n Digite N2");
			int du2 = Integer.parseInt(d2);
			float div = (du1 / du2);
			JOptionPane.showInputDialog("Resultado" + "\n" + div );
			   break;
			   
		case 5:
			String md1 = JOptionPane.showInputDialog("Media" + "\n Digite N1");
			int med1 = Integer.parseInt(md1);
			String md2 = JOptionPane.showInputDialog("Media" + "\n Digite N2");
			int med2 = Integer.parseInt(md2);
			float media = (med1 + med2 / 2);
			JOptionPane.showInputDialog("Resultado" + "\n" + media );
			break;
			
		default:
			JOptionPane.showInputDialog("Escolha de 1-4!");
			break;
	
			
		}

	}

}
