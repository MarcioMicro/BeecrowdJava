package beginner.page02;

import java.util.Scanner;

public class Bee1051 {

	public static void main(String[] args) {
		
		double salary, tax = 0;
		Scanner s = new Scanner(System.in);
		salary = s.nextDouble();
		s.close();
		
		if (salary > 4500) {
			tax += (salary-4500) * 0.28;
			salary = 4500;
		}
		if (salary > 3000) {
			tax += (salary-3000) * 0.18;
			salary = 3000;
		}
		if (salary > 2000) {
			tax += (salary-2000) * 0.08;			
		}
		
		if (tax == 0) System.out.printf("Isento\n");
		else System.out.printf("R$ %.2f\n", tax);
	}
}
