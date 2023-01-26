package beginner.page02;

import java.util.Scanner;

public class Bee1043 {
	
	public static void main(String[] args) {
		double A, B, C;
		Scanner s = new Scanner(System.in);
		A = s.nextDouble();
		B = s.nextDouble();
		C = s.nextDouble();
		s.close();
		
		if (A>=B+C || B>=A+C || C>=A+B) {
			System.out.printf("Area = %.1f\n", (((A+B)*C)/2));
		}
		else {
			System.out.printf("Perimetro = %.1f\n", (A+B+C));
		}
	}
}
