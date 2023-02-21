package beginner.page04;

import java.util.Scanner;

public class Bee1154 {

	public static void main(String[] args) {
		
		int age, count=0, total=0;
		Scanner s = new Scanner(System.in);
		age = s.nextInt();
		
		while (age >= 0) {
			total += age;
			count++;
			age = s.nextInt();
		}				
		s.close();
		System.out.printf("%.2f\n", ((double) total/count));		
	}
}
