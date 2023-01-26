package beginner.page02;

import java.util.Scanner;

public class Bee1041 {
	public static void main(String[] args) {
		double x, y;
		Scanner s = new Scanner(System.in);
		x = s.nextDouble();
		y = s.nextDouble();
		s.close();
		if (x==0) {
			if (y==0) System.out.println("Origem");
			else System.out.println("Eixo Y");
		}
		else if (y==0) System.out.println("Eixo X");
		else if (x>0) {
			if (y>0) System.out.println("Q1");
			else System.out.println("Q4");
		}
		else {
			if (y<0) System.out.println("Q3");
			else System.out.println("Q2");
		}
	}
}
