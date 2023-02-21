package beginner.page05;

import java.util.Scanner;

public class Bee1541 {
	public static void main(String[] args) {
		int A, B, C, landArea;
		Scanner s = new Scanner(System.in);
		while ((A = s.nextInt()) != 0) {
			B = s.nextInt();
			C = s.nextInt();
			landArea = A*B*100/C;
			System.out.println((int) Math.sqrt(landArea));
		}
		s.close();
	}
}
