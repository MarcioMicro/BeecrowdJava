package beginner.page03;

import java.util.Scanner;

public class Bee1113 {

	public static void main(String[] args) {
		
		int X, Y;
		Scanner s = new Scanner(System.in);
		X = s.nextInt();
		Y = s.nextInt();
		
		while (X != Y) {
			if (X>Y) System.out.println("Decrescente");
			else System.out.println("Crescente");
			X = s.nextInt();
			Y = s.nextInt();
		}
		
		s.close();
	}
}
