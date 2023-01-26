package beginner.page01;

import java.util.Scanner;
import java.util.Locale;

public class Bee1017 {
	public static void main(String[] args) {
		int tempoGasto, velMedia, distancia;
		Scanner s = new Scanner(System.in);
		tempoGasto = s.nextInt();
		velMedia = s.nextInt();
		s.close();
		distancia = tempoGasto * velMedia;
		System.out.printf(Locale.US, "%.3f%n", distancia/12.0);
	}
}
