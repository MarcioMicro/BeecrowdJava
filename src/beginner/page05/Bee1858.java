package beginner.page05;

import java.util.Scanner;

public class Bee1858 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int T = s.nextInt();
		int minimum = T;
		int pos = 0;
		for (int i=1; i<N; i++) {
			T = s.nextInt();
			if (T<minimum) {
				minimum = T;
				pos = i;
			}
		}
		System.out.println(pos+1);
		s.close();
	}
}
