//NEGATIVO OU POSITIVO

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_02_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		float nqdeveserpositivo;

		System.out.println("==Digite um numero positivo ou negativo==");
		nqdeveserpositivo = captura.nextFloat();

		if (nqdeveserpositivo > 0) {
			System.out.println(nqdeveserpositivo + " é um numero positivo!");
		} else {
			System.out.println(nqdeveserpositivo + " é um numero negativo");
		}
	}

}
