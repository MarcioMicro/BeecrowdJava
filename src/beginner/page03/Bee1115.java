package beginner.page03;

import java.util.Scanner;

public class Bee1115 {

	public static void main(String[] args) {
		
		int X, Y;
		Scanner s = new Scanner(System.in);
		X = s.nextInt();
		Y = s.nextInt();
		
		while (X!=0 && Y!=0) {
			if (X>0 && Y>0) System.out.println("primeiro");
			if (X<0 && Y>0) System.out.println("segundo");
			if (X<0 && Y<0) System.out.println("terceiro");
			if (X>0 && Y<0) System.out.println("quarto");
			X = s.nextInt();
			Y = s.nextInt();
		}
		
		s.close();
	}
}
