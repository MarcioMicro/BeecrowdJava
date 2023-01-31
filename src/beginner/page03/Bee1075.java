package beginner.page03;

import java.util.Scanner;

public class Bee1075 {

	public static void main(String[] args) {
		
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		s.close();
		for (int i=1; i<=10000; i++) {
			if (i%N==2) System.out.println(i);
		}
	}
}
