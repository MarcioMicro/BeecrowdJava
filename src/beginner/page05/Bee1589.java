package beginner.page05;

import java.util.Scanner;

public class Bee1589 {
	public static void main(String[] args) {
		int T, R1, R2;
		Scanner s = new Scanner(System.in);
		T = s.nextInt();
		
		while (T-->0) {
			R1 = s.nextInt();
			R2 = s.nextInt();
			System.out.println(R1 + R2);
		}
		s.close();
	}
}
