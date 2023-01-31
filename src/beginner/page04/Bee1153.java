package beginner.page04;

import java.util.Scanner;

public class Bee1153 {

	public static void main(String[] args) {
		
		int N, factorial;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		s.close();
		
		factorial = N;
		for (int i = N-1; i>0; i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
}
