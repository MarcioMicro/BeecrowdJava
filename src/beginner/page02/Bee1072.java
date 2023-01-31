package beginner.page02;

import java.util.Scanner;

public class Bee1072 {

	public static void main(String[] args) {
		
		int N, X, in=0, out=0;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		
		while (N-- > 0) {
			X = s.nextInt();
			if (X>=10 && X<=20) in++;
			else out++;
		}		
		s.close();
		System.out.println(in + " in\n" + out + " out");
	}
}
