package beginner.page01;

import java.util.Locale;
import java.util.Scanner;

public class Bee1002 {
	
	public static void main(String[] args) {
		final double pi = 3.14159;
		double raio, area;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		raio = s.nextDouble();
		s.close();
		area = raio*raio*pi;
		System.out.printf(Locale.US, "A=%.4f%n", area);
	}
	
}
