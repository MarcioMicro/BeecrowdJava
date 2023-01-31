package beginner.page04;

import java.util.Scanner;

public class Bee1146b {

	public static void main(String[] args) {
		
		int X;
		String answer="";
		Scanner s = new Scanner(System.in);
		
		while (true) {
			X = s.nextInt();
			if (X==0) break;
			for (int i=1; i<X; i++) answer += (i + " ");
			answer += (X + "\n");
		}
		s.close();
		System.out.println(answer);
	}
}
