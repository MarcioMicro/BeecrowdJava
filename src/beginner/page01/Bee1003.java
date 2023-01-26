package beginner.page01;

import java.util.Scanner;

public class Bee1003 {
	
	public static void main (String[] args) {
		int A, B, SOMA;
		
		Scanner s = new Scanner(System.in);
		A = s.nextInt();
		B = s.nextInt();
		s.close();
		SOMA = A + B;
		System.out.println("SOMA = " + SOMA);
	}
}
