package beginner.page04;

import java.util.Scanner;

public class Bee1159 {

	public static void main(String[] args) {
		
		int X, sum;
		Scanner s = new Scanner(System.in);
		X = s.nextInt();
		
		while (X!=0) {
			if (X%2!=0) X++;
			sum = 0;
			for (int i=0; i<5; i++) {
				sum += X + 2*i;
			}
			System.out.println(sum);
			X = s.nextInt();
		}		
		s.close();
	}
}
