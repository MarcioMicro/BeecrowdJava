package beginner.page04;

import java.util.Scanner;

public class Bee1178 {
	public static void main(String[] args) {
		double[] N = new double[100];
		Scanner s = new Scanner(System.in);
		N[0] = s.nextDouble();
		s.close();		
		System.out.printf("N[0] = %.4f\n", N[0]);
		for (int i=1; i<100; i++) {
			N[i] = N[i-1]/2;
			System.out.printf("N[%d] = %.4f\n", i, N[i]);
		}
	}
}
