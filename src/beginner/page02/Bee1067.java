package beginner.page02;

import java.util.Scanner;

public class Bee1067 {

	public static void main(String[] args) {
		
		int X;
		Scanner s = new Scanner(System.in);
		X = s.nextInt();
		s.close();
		
		if (X%2==0) X--;
		for (int i=1; i<=X; i+=2) System.out.println(i);
	}
}
