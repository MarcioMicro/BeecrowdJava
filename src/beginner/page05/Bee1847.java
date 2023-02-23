package beginner.page05;

import java.util.Scanner;

public class Bee1847 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		s.close();
		
		int firstVar = A-B;
		int secondVar = B-C;
		
		
		if (firstVar==secondVar && firstVar<0) System.out.println(":)");
		else if (firstVar>secondVar) System.out.println(":)");
		else System.out.println(":(");
	}
}
