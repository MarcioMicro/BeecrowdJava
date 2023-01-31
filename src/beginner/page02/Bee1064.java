package beginner.page02;

import java.util.Scanner;

public class Bee1064 {

	public static void main(String[] args) {
		
		double value, sum=0;
		int count=0;
		Scanner s = new Scanner(System.in);
		for (int i=0; i<6; i++) {
			value = s.nextDouble();
			if (value > 0) {
				sum += value;
				count++;
			}
		}
		s.close();
		
		System.out.printf("%d valores positivos\n%.1f\n", count, (sum/count));
	}
}
