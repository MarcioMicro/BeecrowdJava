package beginner.page02;

import java.util.Scanner;

public class Bee1070 {

	public static void main(String[] args) {
		
		int X;
		Scanner s = new Scanner(System.in);
		X = s.nextInt();
		s.close();
		
		if (X%2==0) X++;
		for (int i=0; i<6; i++) {
			System.out.println((X+i*2));
		}
	}
}
