package beginner.page06;

import java.util.Scanner;

public class Bee1865 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String name;
		while (N-->0) {
			name = s.next();
			s.next();
			if (name.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
		}
		s.close();
	}
}
