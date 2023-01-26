package beginner.page02;

import java.util.Scanner;

public class Bee1046 {

	public static void main(String[] args) {
		
		int start, end, gameDuration;
		Scanner s = new Scanner(System.in);
		start = s.nextInt();
		end = s.nextInt();
		s.close();
		
		gameDuration = (end - start + 24)%24;
		if (gameDuration == 0) gameDuration = 24;
		
		System.out.println("O JOGO DUROU " + gameDuration + " HORA(S)");
		
	}
}