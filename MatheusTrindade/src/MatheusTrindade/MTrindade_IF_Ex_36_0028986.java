//ALTERAR ELEMENTO DO ARRAY

package MatheusTrindade;

public class MTrindade_IF_Ex_36_0028986 {

	public static void main (String[] args) {

		int[] numeros = {1, 2, 3, 4, 5};

		System.out.println("Array original:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		numeros[2] = 99;

		System.out.println("Array atualizado:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
