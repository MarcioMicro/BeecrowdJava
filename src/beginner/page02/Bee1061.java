package beginner.page02;

import java.util.Scanner;

public class Bee1061 {

	public static void main(String[] args) {
		
		int minute=60, hour=60*minute, day=24*hour;
		int W1, X1, Y1, Z1, W2, X2, Y2, Z2, begin, end, total;
		@SuppressWarnings("unused")
		String trash;
		Scanner s = new Scanner(System.in);
		trash = s.next(); 
		W1 = s.nextInt();
		X1 = s.nextInt();
		trash = s.next(); 
		Y1 = s.nextInt();
		trash = s.next(); 
		Z1 = s.nextInt();
		trash = s.next(); 
		W2 = s.nextInt();
		X2 = s.nextInt();
		trash = s.next(); 
		Y2 = s.nextInt();
		trash = s.next(); 
		Z2 = s.nextInt();
		s.close();		
		
		begin = W1*day + X1*hour + Y1*minute + Z1;
		end = W2*day + X2*hour + Y2*minute + Z2;
		total = end - begin;
		System.out.println((total/day) + " dia(s)");
		total %= day;
		System.out.println((total/hour) + " hora(s)");
		total %= hour;
		System.out.println((total/minute) + " minuto(s)");
		total %= minute;
		
		System.out.println(total + " segundo(s)");
	}
}
