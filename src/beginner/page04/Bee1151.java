package beginner.page04;

import java.util.Scanner;

public class Bee1151 {

	public static void main(String[] args) {
		
		int N, a=0, b=1, c;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		s.close();
		
		if (N==1) System.out.println("0");
		else if (N==2) System.out.println("0 1");
		else {
			System.out.print("0 1");
			for (int i=2; i<N; i++) {
				c = a+b;
				System.out.print(" " + c);
				a = b;
				b = c;
			}
			System.out.println();
		}		
	}
}
