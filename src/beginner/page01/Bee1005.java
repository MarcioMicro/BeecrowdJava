package beginner.page01;

import java.util.Scanner;
import java.util.Locale;

public class Bee1005 {
	
	public static void main(String[] args) {
		double A, B, media;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		A = s.nextDouble();
		B = s.nextDouble();
		s.close();
		
		media = (A*3.5 + B*7.5)/11;
		
		System.out.printf(Locale.US, "MEDIA = %.5f%n", media);
	}
}
