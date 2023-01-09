package iniciante;

import java.util.Scanner;

public class Bee1035 {
	
	public static void main(String[] args) {
		int A, B, C, D;
		Scanner s = new Scanner(System.in);
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		D = s.nextInt();
		s.close();
		if (B>C && D>A && C+D>A+B && C>0 && D>0 && A%2==0) 
			System.out.println("Valores aceitos");
		else
			System.out.println("Valores nao aceitos");
	}
}
