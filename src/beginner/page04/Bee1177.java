package beginner.page04;

import java.util.Scanner;

public class Bee1177 {
	public static void main(String[] args) {
		int[] N = new int[1000];
		int T;
		Scanner s = new Scanner(System.in);
		T = s.nextInt();
		s.close();
		N[0] = 0;
		System.out.println("N[0] = " + N[0]);
		for (int i=1; i<1000; i++) {
			N[i] = N[i-1] + 1;
			if (N[i] == T) N[i] = 0;
			System.out.println("N[" + i + "] = " + N[i]);
		}
	}
}
