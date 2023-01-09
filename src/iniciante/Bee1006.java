package iniciante;

import java.util.Scanner;
import java.util.Locale;

public class Bee1006 {
	public static void main (String[] args) {
		double A, B, C, MEDIA;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		A = s.nextDouble();
		B = s.nextDouble();
		C = s.nextDouble();
		s.close();
		MEDIA = (A*2 + B*3 + C*5)/10;
		System.out.printf(Locale.US, "MEDIA = %.1f%n", MEDIA);
	}
}
