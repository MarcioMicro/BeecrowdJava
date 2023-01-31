package beginner.page03;

import java.util.Scanner;

public class Bee1080 {

	public static void main(String[] args) {
		
		int number, oldNumber=0, highest=0, position=0;
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i<100; i++) {
			number = s.nextInt();
			if (number>oldNumber) {
				highest = number;
				position = i+1;
				oldNumber = number;
			}
		}
		System.out.println(highest + "\n" + position);
		s.close();
	}
}
