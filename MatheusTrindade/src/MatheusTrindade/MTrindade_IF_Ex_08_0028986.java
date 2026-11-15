//MESES DO ANO

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_08_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		int mes;
		
		System.out.println("digite um numero 1-12");
		mes = captura.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("JAN");
			break;
		case 2:
			System.out.println("FEV");
			break;
		case 3:
			System.out.println("MAR");
			break;
		case 4:
			System.out.println("ABR");
			break;
		case 5:
			System.out.println("MAY");
			break;
		case 6:
			System.out.println("JUN");
			break;
		case 7:
			System.out.println("JULY");
			break;
		case 8:
			System.out.println("AGO");
			break;
		case 9:
			System.out.println("SET");
			break;
		case 10:
			System.out.println("OUT");
			break;
		case 11:
			System.out.println("NOV");
			break;
		case 12:
			System.out.println("DEZ");
			break;
		default:
			System.out.println("mes invalido!!!!!");
		}
	}
}