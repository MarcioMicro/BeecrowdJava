package beginner.page02;

import java.util.Scanner;

public class Bee1047 {

	public static void main(String[] args) {
		
		int hourStart, minuteStart, hourEnd, minuteEnd, hours, minutes;
		Scanner s = new Scanner(System.in);
		hourStart = s.nextInt();
		minuteStart = s.nextInt();
		hourEnd = s.nextInt();
		minuteEnd = s.nextInt();
		s.close();
		
		hours = hourEnd - hourStart;
		minutes = minuteEnd - minuteStart;
		if (minutes<0) hours--;
		hours = (hours + 24)%24;
		minutes = (minutes + 60)%60;
		if (hours == 0 && minutes == 0) hours = 24;
		
		System.out.println("O JOGO DUROU " + hours + " HORA(S) E "
				+ minutes + " MINUTO(S)");
		
	}
}
