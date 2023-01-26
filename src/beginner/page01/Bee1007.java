package beginner.page01;

import java.util.Scanner;

public class Bee1007 {
	public static void main(String[] args) {
		int A, B, C, D, dif;
		Scanner s = new Scanner(System.in);
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		D = s.nextInt();
		s.close();
		dif = A*B - C*D;
		System.out.println("DIFERENCA = " + dif);
	}
}
