package beginner.page04;

import java.util.Scanner;

public class Bee1176 {
	public static void main(String[] args) {
		long[] fib = new long[61];
		fib[0] = 0;
		fib[1] = 1;
		for (int i=2; i<=60; i++) fib[i] = fib[i-2] + fib[i-1];
		int T, N;
		Scanner s = new Scanner(System.in);
		T = s.nextInt();
		while (T-->0) {
			N = s.nextInt();
			System.out.println("Fib(" + N + ") = " + fib[N]);
		}				
		s.close();		
	}
}