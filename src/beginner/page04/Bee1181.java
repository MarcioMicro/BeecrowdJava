package beginner.page04;

import java.util.Scanner;

public class Bee1181 {
	public static void main(String[] args) {
		int L;
		char T;
		double[][] M = new double[12][12];
		double sum=0;
		Scanner s = new Scanner(System.in);
		L = s.nextInt();
		T = s.next().charAt(0);
		for (int i=0; i<12; i++) {
			for (int j=0; j<12; j++) M[i][j] = s.nextDouble();
		}
		s.close();
		
		for (int i=0; i<12; i++)  sum += M[L][i];
		if (T == 'S') System.out.printf("%.1f\n", sum);
		if (T == 'M') System.out.printf("%.1f\n", sum/12);		
	}
}
