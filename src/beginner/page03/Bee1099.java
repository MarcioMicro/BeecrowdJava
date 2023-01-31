package beginner.page03;

import java.util.Scanner;

public class Bee1099 {

	public static void main(String[] args) {
		
		int N, X, Y, sum;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		
		while (N-->0) {
			sum = 0;
			X = s.nextInt();
			Y = s.nextInt();
			if (X>Y) {
				X = X + Y;
				Y = X - Y;
				X = X - Y;
			}
			if (X%2==0) X++;
			else X+=2;
			for (int i=X; i<Y; i+=2) sum += i;
			System.out.println(sum);
		}		
		s.close();
	}
}
