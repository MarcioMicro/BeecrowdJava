package beginner.page03;

import java.util.Scanner;

public class Bee1132 {

	public static void main(String[] args) {
		
		int X, Y, sum=0;
		Scanner s = new Scanner(System.in);
		X = s.nextInt();
		Y = s.nextInt();
		s.close();
		
		if (X > Y) {
			X = X + Y;
			Y = X - Y;
			X = X - Y;
		}
		
		for (int i=X; i<=Y; i++) {
			if (i%13==0) continue;
			sum += i;
		}
		System.out.println(sum);
	}
}
