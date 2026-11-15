//TURNO DE ESTUDO

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_10_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		int turno;

		System.out.println("Digite o turno: (1) Matutino (2) Vespertino (3) Noturno");
		turno = captura.nextInt();

		switch (turno) {
		case 1:
			System.out.println("Turno matutino");
			break;
		case 2:
			System.out.println("Turno vespertino");
			break;
		case 3:
			System.out.println("Turno noturno");
			break;
		default:
			System.out.println("Turno invalido!");
		}
	}

}
