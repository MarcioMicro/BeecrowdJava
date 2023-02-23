package beginner.page06;

import java.util.Scanner;

public class Bee1914 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int QT = s.nextInt();
		while (QT-->0) {
			String player1 = s.next();
			String choice1 = s.next();
			String player2 = s.next();
			s.next();
			int number1 = s.nextInt();
			int number2 = s.nextInt();
			
			if ((number1+number2)%2==0) {
				if (choice1.equals("PAR")) System.out.println(player1);
				else System.out.println(player2);
			}
			else {
				if (choice1.equals("PAR")) System.out.println(player2);
				else System.out.println(player1);				
			}
		}
		s.close();
	}
}
