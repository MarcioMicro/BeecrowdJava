package beginner.page03;

import java.util.Scanner;

public class Bee1074 {

	public static void main(String[] args) {
		
		int N, X;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		
		while (N-- > 0) {
			X = s.nextInt();
			if (X==0) System.out.println("NULL");
			else {
				if (X%2==0) System.out.print("EVEN ");
				else System.out.print("ODD ");
				if (X>0) System.out.println("POSITIVE");
				else System.out.println("NEGATIVE");
			}
		}		
		s.close();		
	}
}
