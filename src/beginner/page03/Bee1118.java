package beginner.page03;

import java.util.Scanner;

public class Bee1118 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		int nc=1;
		
		while (nc==1) {
			System.out.printf("media = %.2f\n", averageCalc());
			do {
				System.out.println("novo calculo (1-sim 2-nao)");
				nc = s.nextInt();			
			} while (nc!=1 && nc!=2);
		}
		
		s.close();
	}
	
	static double averageCalc() {
		double score, total=0;
		int count=0;
		
		while (count<2) {
			score = s.nextDouble();
			if (score>=0 && score<=10) {
				total += score;
				count++;
			}
			else System.out.println("nota invalida");
		}
		return total/2;
	}	
}

