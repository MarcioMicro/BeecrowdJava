package beginner.page03;

import java.util.Scanner;

public class Bee1078 {

	public static void main(String[] args) {
		
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		s.close();
		
		for (int i=1; i<=10; i++) {
			System.out.println(i + " x " + N + " = " + (i*N));
		}
	}
}
