package beginner.page04;

import java.util.Scanner;

public class Bee1150 {

	public static void main(String[] args) {
		
		int X, Z, count=0, sum=0;
		Scanner s = new Scanner(System.in);
		X = s.nextInt();
		Z = s.nextInt();
		while (Z<=X) Z = s.nextInt();
		s.close();
		
		while (sum < Z) {
			sum += (X + count);
			count++;
		}
		System.out.println(count);
	}
}
