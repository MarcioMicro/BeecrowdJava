package beginner.page02;

import java.util.Scanner;

public class Bee1042 {
	
	public static void main(String[] args) {
 
		int a, b, c;
		Scanner s = new Scanner(System.in);		
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		s.close();
		
		int x, y, z;
		if (a<b) {
			if (a<c) {
				x = a;
				if (b<c) { y = b; z = c; }
				else { y = c; z = b; }
			}
			else { x = c; y = a; z = b; }
		} 
		else {
			if (b<c) {
				x = b;
				if (a<c) { y = a; z = c; }
				else { y = c; z = a; }
			}
			else { x = c; y = b; z = a; }
		}
		
		System.out.println(x + "\n" + y + "\n" + z + "\n");		
		System.out.println(a + "\n" + b + "\n" + c);		
	}
}
