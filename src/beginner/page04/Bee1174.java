package beginner.page04;

import java.util.Scanner;

public class Bee1174 {
	public static void main(String[] args) {
		double[] A = new double[100];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<100; i++) {
			A[i] = s.nextDouble();
			if (A[i] <= 10) System.out.println("A[" + i + "] = " + A[i]);
		}
		s.close();		
	}
}
