//NUMERO PAR OU IMPAR

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_04_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		int numero;

		System.out.println("==Digite um numero inteiro==");
		numero = captura.nextInt();

		if (numero % 2 == 0) {
			System.out.println(numero + " é um numero par!");
		} else {
			System.out.println(numero + " é um numero impar!");
		}
	}

}
