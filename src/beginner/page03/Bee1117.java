package beginner.page03;

import java.util.Scanner;

public class Bee1117 {

	public static void main(String[] args) {
		
		double score, total=0;
		int count=0;
		Scanner s = new Scanner(System.in);
		
		while (count<2) {
			score = s.nextDouble();
			if (score>=0 && score<=10) {
				total += score;
				count++;
			}
			else System.out.println("nota invalida");
		}
		
		s.close();
		System.out.printf("media = %.2f\n", (total/2));
		
	}
}
