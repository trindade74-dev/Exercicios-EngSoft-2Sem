//NUMERO POSITIVO

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_24_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Digite um numero positivo");
			numero = captura.nextInt();

			if (numero <= 0) {
				System.out.println("Valor inválido! Digite um número maior que zero.");
			}
		} while (numero <= 0);

		System.out.println("Número válido digitado: " + numero);
	}

}
