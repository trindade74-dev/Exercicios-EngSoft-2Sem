//TABUADA

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_17_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		int numero, contador = 1;

		System.out.println("Digite um numero para ver a tabuada");
		numero = captura.nextInt();

		while (contador <= 10) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
			contador++;
		}
	}

}
