package beginner.page04;

import java.util.Scanner;

public class Bee1157 {

	public static void main(String[] args) {
		
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		s.close();
		
		for (int i=1; i<=N; i++) {
			if (N%i==0) System.out.println(i);
		}
	}
}
