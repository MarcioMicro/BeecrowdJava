package beginner.page03;

import java.util.Scanner;

public class Bee1142 {

	public static void main(String[] args) {
		
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		s.close();
		
		for (int i=0; i<N; i++) {
			for (int j=1; j<=4; j++) {
				if (j==4) System.out.println("PUM");
				else System.out.print((i*4+j) + " ");
			}
		}
	}
}
