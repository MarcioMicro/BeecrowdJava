package beginner.page04;

import java.util.Scanner;

public class Bee1149 {

	public static void main(String[] args) {
		
		int A, N, sum=0;
		Scanner s = new Scanner(System.in);
		A = s.nextInt();
		N = s.nextInt();
		while (N<1) N = s.nextInt();
		s.close();
		
		for (int i=A; i<N+A; i++) sum += i;
		
		System.out.println(sum);
	}
}
