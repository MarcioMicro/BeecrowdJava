package iniciante;

import java.util.Scanner;

public class Bee1020 {
	public static void main(String[] args) {
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		s.close();
		System.out.println(N/365 + " ano(s)");
		N %= 365;
		System.out.println(N/30 + " mes(es)");
		N %= 30;
		System.out.println(N + " dia(s)");
	}
}