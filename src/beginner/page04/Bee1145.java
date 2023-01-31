package beginner.page04;

import java.util.Scanner;

public class Bee1145 {

	public static void main(String[] args) {
		
		int X, Y;
		Scanner s = new Scanner(System.in);
		X = s.nextInt();
		Y = s.nextInt();
		s.close();
		
		for (int i=1; i<=Y; i++) {
			if (i%X == 0) System.out.println(i);
			else System.out.print(i + " ");
		}
	}
}
