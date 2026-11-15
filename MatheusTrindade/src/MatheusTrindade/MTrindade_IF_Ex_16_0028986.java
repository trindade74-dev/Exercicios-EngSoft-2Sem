//SOMA DOS NUMEROS DE 1 A 100

package MatheusTrindade;

public class MTrindade_IF_Ex_16_0028986 {

	public static void main (String[] args) {

		int numero = 1;
		int soma = 0;

		while (numero <= 100) {
			soma += numero;
			numero++;
		}

		System.out.println("A soma dos números de 1 a 100 é: " + soma);
	}

}
