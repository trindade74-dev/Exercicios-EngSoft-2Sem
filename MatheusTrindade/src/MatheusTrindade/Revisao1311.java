package MatheusTrindade;
import javax.swing.JOptionPane;

public class Revisao1311 {

	public static void main(String[] args) {

		String continuar = "sim";
		int contador = 0; 

		while (continuar.equalsIgnoreCase("sim")) {

			// ENTRADA
			String x = JOptionPane.showInputDialog("Digite um numero de 1-100");
			int numero = Integer.parseInt(x);

			// CONDICIONAIS
			if (numero % 2 == 0) {
				JOptionPane.showMessageDialog(null, "numero par");
			} else {
				JOptionPane.showMessageDialog(null, "numero impar");
			}

			contador++;

			continuar = JOptionPane.showInputDialog("Deseja verificar outro numero? (sim/nao)");
		}


		JOptionPane.showMessageDialog(null, " " + contador + " numero verificados");

	}
}