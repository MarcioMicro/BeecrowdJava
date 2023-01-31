package beginner.page02;

import java.util.Scanner;

public class Bee1065 {

	public static void main(String[] args) {
		
		int value, count=0;
		Scanner s = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			value = s.nextInt();
			if (value%2==0) {
				count++;
			}
		}
		s.close();
		System.out.println(count + " valores pares");
	}
}
