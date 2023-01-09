package iniciante;

import java.util.Scanner;

public class Bee1001 {
	public static void main(String[] args) {
		int A, B, X;
		Scanner s = new Scanner(System.in);
		A = s.nextInt();
		B = s.nextInt();
		s.close();
		X = A + B;		
		System.out.println("X = " + X);
	}
}
