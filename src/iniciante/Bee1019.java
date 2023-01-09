package iniciante;

import java.util.Scanner;

public class Bee1019 {
	public static void main(String[] args) {
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		s.close();
		System.out.print(N/3600 + ":");
		N %= 3600;
		System.out.print(N/60 + ":");
		N %= 60;
		System.out.println(N);
	}
}
