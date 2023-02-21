package beginner.page05;

import java.util.Scanner;

public class Bee1564 {
	public static void main(String[] args) {
		int N;
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			N = s.nextInt();
			if (N == 0) System.out.println("vai ter copa!");
			else System.out.println("vai ter duas!");
		}
		s.close();
	}
}
