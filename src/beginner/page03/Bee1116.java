package beginner.page03;

import java.util.Scanner;

public class Bee1116 {

	public static void main(String[] args) {
		
		int N, X, Y;
		double div;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		
		while (N-->0) {
			X = s.nextInt();
			Y = s.nextInt();
			if (Y==0) System.out.println("divisao impossivel");
			else {
				div = (double) X/Y;
				System.out.printf("%.1f\n", div);
			}
		}		
		s.close();
	}
}
