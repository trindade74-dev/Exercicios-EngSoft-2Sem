//CONCEITO ESCOLAR

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_12_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		char conceito;

		System.out.println("Digite o conceito (A, B, C ou D)");
		conceito = captura.next().charAt(0);

		switch (conceito) {
		case 'A':
		case 'a':
			System.out.println("Excelente!");
			break;
		case 'B':
		case 'b':
			System.out.println("Bom!");
			break;
		case 'C':
		case 'c':
			System.out.println("Regular!");
			break;
		case 'D':
		case 'd':
			System.out.println("Insuficiente!");
			break;
		default:
			System.out.println("Conceito inválido!");
		}
	}

}
