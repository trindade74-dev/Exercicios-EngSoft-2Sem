//CONTAGEM DE NUMEROS PARES

package MatheusTrindade;

public class MTrindade_IF_Ex_35_0028986 {

	public static void main (String[] args) {

		int[] numeros = {4, 7, 10, 15, 22, 33, 40, 51, 68, 77};
		int contadorPares = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				contadorPares++;
			}
		}

		System.out.println("Quantidade de números pares: " + contadorPares);
	}

}
