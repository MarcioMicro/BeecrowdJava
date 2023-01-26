package beginner.page02;

import java.util.Scanner;

public class Bee1044 {

	public static void main(String[] args) {
		int A, B;
		Scanner s = new Scanner(System.in);
		A = s.nextInt();
		B = s.nextInt();
		s.close();
		
		if (A%B == 0 || B%A == 0) System.out.println("Sao Multiplos");
		else System.out.println("Nao sao Multiplos");
	}
}
