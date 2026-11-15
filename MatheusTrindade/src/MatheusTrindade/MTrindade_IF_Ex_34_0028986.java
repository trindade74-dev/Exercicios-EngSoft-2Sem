//MAIOR ELEMENTO DO ARRAY

package MatheusTrindade;

public class MTrindade_IF_Ex_34_0028986 {

	public static void main (String[] args) {

		int[] numeros = {15, 42, 8, 23, 56, 4};
		int maior = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}

		System.out.println("O maior elemento do array é: " + maior);
	}

}
