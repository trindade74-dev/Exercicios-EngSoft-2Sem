//MEDIA DAS NOTAS

package MatheusTrindade;

public class MTrindade_IF_Ex_33_0028986 {

	public static void main (String[] args) {

		double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5, 7.0};
		double soma = 0;

		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}

		double media = soma / notas.length;

		System.out.println("A média das notas é: " + media);
	}

}
