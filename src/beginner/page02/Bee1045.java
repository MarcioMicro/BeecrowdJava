package beginner.page02;

import java.util.Scanner;

public class Bee1045 {

	public static void main(String[] args) {
		double A, B, C, aux;
		Scanner s = new Scanner(System.in);
		A = s.nextDouble();
		B = s.nextDouble();
		C = s.nextDouble();
		s.close();
		
		if (A<B) { aux = A; A = B; B = aux;	}
		if (B<C) { aux = B; B = C; C = aux;	}
		if (A<B) { aux = A; A = B; B = aux;	}
		
		if (A >= (B + C)) System.out.println("NAO FORMA TRIANGULO");
		else {
			if (A*A == B*B + C*C) System.out.println("TRIANGULO RETANGULO");
			else if (A*A > B*B + C*C) System.out.println("TRIANGULO OBTUSANGULO");
			else System.out.println("TRIANGULO ACUTANGULO");
			
			if (A==B && B==C) System.out.println("TRIANGULO EQUILATERO");
			else if (A==B || A==C || B==C) System.out.println("TRIANGULO ISOSCELES");
		}
	}
}