package beginner.page02;

import java.util.Scanner;

public class Bee1060 {

	public static void main(String[] args) {
		
		double num;
		int count = 0;
		Scanner s = new Scanner(System.in);
		for (int i=0; i<6; i++) {
			num = s.nextDouble();
			if (num > 0) count++;
		}
		s.close();
		System.out.println(count + " valores positivos");
	}
}
