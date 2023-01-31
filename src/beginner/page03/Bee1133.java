package beginner.page03;

import java.util.Scanner;

public class Bee1133 {

	public static void main(String[] args) {
		
		int X, Y;
		Scanner s = new Scanner(System.in);
		X = s.nextInt();
		Y = s.nextInt();
		s.close();
		
		if (X > Y) {
			X = X + Y;
			Y = X - Y;
			X = X - Y;
		}
		
		for (int i=X+1; i<Y; i++) {
			if (i%5==2 || i%5==3) System.out.println(i);			
		}
	}
}
