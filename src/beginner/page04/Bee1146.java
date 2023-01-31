package beginner.page04;

import java.util.Scanner;

public class Bee1146 {

	public static void main(String[] args) {
		
		int X;
		Scanner s = new Scanner(System.in);
		
		while (true) {
			X = s.nextInt();
			if (X==0) break;
			for (int i=1; i<X; i++) System.out.print(i + " ");
			System.out.println(X);
		}
		s.close();
	}
}
