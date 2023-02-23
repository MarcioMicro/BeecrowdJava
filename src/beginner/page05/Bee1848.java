package beginner.page05;

import java.util.Scanner;

public class Bee1848 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		while (count < 3) {
			String action = s.nextLine();
			int sum = 0;
			while (!action.equals("caw caw")) {
				sum += decoder(action);
				action = s.nextLine();
			}
			count++;
			System.out.println(sum);
		}
		
		s.close();
	}
	
	public static int decoder(String a) {
		switch (a) {
		case "---": return 0; 
		case "--*": return 1;
		case "-*-": return 2;
		case "-**": return 3;
		case "*--": return 4;
		case "*-*": return 5;
		case "**-": return 6;
		case "***": return 7;
		default: return 0;
		}
	}
}
