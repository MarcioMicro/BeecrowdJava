package beginner.page01;

import java.util.Scanner;
import java.util.Locale;

public class Bee1015 {
	
	public static void main(String[] args) {
		final double pi = 3.14159;
		double raio, vol;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		raio = s.nextDouble();
		s.close();
		
		vol = (4/3.0)*pi*Math.pow(raio, 3);
		System.out.printf(Locale.US, "VOLUME = %.3f%n", vol);
	}
}
