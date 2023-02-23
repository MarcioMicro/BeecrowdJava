package beginner.page05;

import java.util.Scanner;

public class Bee1837 {
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();		
		s.close();
		
		int q = a/b;
		int r = a%b;
		
		if (r<0) {			
			r += Math.abs(b);
			q = (a-r)/b;
		}
		System.out.println(q + " " + r);
	}
}
