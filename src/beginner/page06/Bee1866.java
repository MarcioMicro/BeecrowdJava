package beginner.page06;

import java.util.Scanner;

public class Bee1866 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int C = s.nextInt();
		int N, S, increment;
		while (C-->0) {
			N = s.nextInt();
			S = 0;
			increment = 1;
			while (N-->0) {
				S += increment;
				increment *= -1;
			}
			System.out.println(S);
		}
		s.close();
	}
}
