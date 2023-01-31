package beginner.page03;

import java.util.Scanner;

public class Bee1079 {

	public static void main(String[] args) {
		
		int N;
		double num1, num2, num3, average;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		
		while (N-->0) {
			num1 = num2 = num3 = average = 0;
			num1 = s.nextDouble();
			num2 = s.nextDouble();
			num3 = s.nextDouble();
			average = (num1*2 + num2*3 + num3*5)/10;
			System.out.printf("%.1f\n", average);
		}
		s.close();
	}
}
