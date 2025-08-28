import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tamanho do vetor: ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		double sum = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Inform sua altura: ");
			vect[i] = sc.nextDouble();
		}

		// for (int i = 0; i < vect.length; i++) {
		// sum += vect[i];
		// }

		// Exemplo usando FOR EACH
		for (double mediaAltura : vect) {
			sum += mediaAltura;
		}

		double avg = sum / n;

		System.out.printf("%.2f%n", avg);
	}

}
