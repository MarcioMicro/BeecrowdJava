package beginner.page01;

import java.util.Scanner;

public class Bee1004 {
	public static void main (String[] args) {
		int valor1, valor2, PROD;
		Scanner s = new Scanner(System.in);
		valor1 = s.nextInt();
		valor2 = s.nextInt();
		s.close();
		PROD = valor1 * valor2;
		System.out.println("PROD = " + PROD);
	}
}
