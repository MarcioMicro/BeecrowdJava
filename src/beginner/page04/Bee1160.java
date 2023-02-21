package beginner.page04;

import java.util.Scanner;

public class Bee1160 {

	public static void main(String[] args) {
		
		int T, PA, PB, years;
		double GA, GB;
		Scanner s = new Scanner(System.in);
		T = s.nextInt();
		
		while (T-->0) {
			PA = s.nextInt();
			PB = s.nextInt();
			GA = s.nextDouble();
			GB = s.nextDouble();
			years = 0;
			
			for (int i=1; i<=100; i++) {
				PA += (int) PA*(GA/100);
				PB += (int) PB*(GB/100);
				if (PA>PB) {
					years = i;
					break;
				}
			}
			if (years == 0) System.out.println("Mais de 1 seculo.");
			else System.out.println(years + " anos.");			
		}		
		s.close();
	}
}
