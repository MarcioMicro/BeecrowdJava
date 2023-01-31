package beginner.page02;

import java.util.Scanner;

public class Bee1071 {

	public static void main(String[] args) {
		
		int X, Y, sum=0;
		Scanner s = new Scanner(System.in);
		X = s.nextInt();
		Y = s.nextInt();
		s.close();
		
		if (X>Y) {
			X = X + Y;
			Y = X - Y;
			X = X - Y;
		}
		
		for (int i = X+1; i<Y; i++) {
			if (i%2!=0) sum += i;
		}
		
		System.out.println(sum);
	}
}
