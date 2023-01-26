package beginner.page01;

import java.util.Locale;
import java.util.Scanner;

public class Bee1036 {
	
	public static void main(String[] args) {
		double A, B, C, R1, R2, delta;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		A = s.nextDouble();
		B = s.nextDouble();
		C = s.nextDouble();
		s.close();
		delta = B*B - 4*A*C;
		if (delta < 0 || A == 0) System.out.println("Impossivel calcular");
		else {
			R1 = (-B + Math.sqrt(delta))/(2*A);
			R2 = (-B - Math.sqrt(delta))/(2*A);
			System.out.printf(Locale.US, 
					"R1 = %.5f%nR2 = %.5f%n", R1, R2);
		}
	}
}
