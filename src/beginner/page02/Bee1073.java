package beginner.page02;

import java.util.Scanner;

public class Bee1073 {

	public static void main(String[] args) {
		
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		s.close();
		
		for (int i=2; i<=N; i+=2) {
			System.out.println(i + "^2 = " + i*i);
		}
	}
}
