//SOMA DOS NUMEROS PARES DE 1 A 100

package MatheusTrindade;

public class MTrindade_IF_Ex_30_0028986 {

	public static void main (String[] args) {

		int soma = 0;

		for (int numero = 1; numero <= 100; numero++) {
			if (numero % 2 == 0) {
				soma += numero;
			}
		}

		System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
	}

}
