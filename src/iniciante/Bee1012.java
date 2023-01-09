package iniciante;

import java.util.Scanner;
import java.util.Locale;

public class Bee1012 {
	public static void main(String[] args) {
		double A, B, C;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		A = s.nextDouble();
		B = s.nextDouble();
		C = s.nextDouble();
		s.close();
		System.out.printf(Locale.US,
				"TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",
				A*C/2, 3.14159*Math.pow(C, 2), 0.5*C*(A+B), Math.pow(B, 2), A*B);
		
	}
}
