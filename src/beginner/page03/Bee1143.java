package beginner.page03;

import java.util.Scanner;

public class Bee1143 {

	public static void main(String[] args) {
		
		int N, calc;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		s.close();
		
		for (int i=1; i<=N; i++) {
			for (int j=1; j<=3; j++) {
				calc = (int) Math.pow(i, j);
				if (j<3) System.out.print(calc + " ");
				else System.out.println(calc);
			}
			for (int j=1; j<=3; j++) {
				calc = (int) Math.pow(i, j);
				if (j>1) calc++;
				if (j<3) System.out.print(calc + " ");
				else System.out.println(calc);
			}				
		}
	}
}
