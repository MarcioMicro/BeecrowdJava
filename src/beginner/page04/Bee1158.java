package beginner.page04;

import java.util.Scanner;

public class Bee1158 {

	public static void main(String[] args) {
		
		int N, X, Y, sum;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		
		while (N-->0) {
			X = s.nextInt();
			Y = s.nextInt();
			sum = 0;
			if (X%2 == 0) X++;
			int dif = X + 2*Y;
			for (int i=X; i<dif; i+=2) sum += i;
			System.out.println(sum);
		}		
		s.close();
	}
}
