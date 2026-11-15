//FATORIAL

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_29_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		int numero;
		long fatorial = 1;

		System.out.println("Digite um numero inteiro não negativo");
		numero = captura.nextInt();

		for (int contador = 1; contador <= numero; contador++) {
			fatorial *= contador;
		}

		System.out.println("O fatorial de " + numero + " é: " + fatorial);
	}

}
