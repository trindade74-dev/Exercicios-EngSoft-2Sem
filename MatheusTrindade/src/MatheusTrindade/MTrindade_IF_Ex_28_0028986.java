//TABUADA

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_28_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		int numero;

		System.out.println("Digite um numero para ver a tabuada");
		numero = captura.nextInt();

		for (int contador = 1; contador <= 10; contador++) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
		}
	}

}
