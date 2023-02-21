package beginner.page05;

import java.util.Scanner;

public class Bee1189 {
	public static void main(String[] args) {
		char O;
		double[][] M = new double[12][12];
		double sum=0;
		int count=0;
		Scanner s = new Scanner(System.in);
		O = s.next().charAt(0);
		for (int i=0; i<12; i++) {
			for (int j=0; j<12; j++) M[i][j] = s.nextDouble();
		}
		s.close();
		
		for (int i=1; i<=10; i++) {
			int endJ = i<6 ? i-1 : 10-i;
			for (int j=0; j<=endJ; j++) {
				sum += M[i][j];
				count++;
			}
		}
		if (O == 'S') System.out.printf("%.1f\n", sum);
		if (O == 'M') System.out.printf("%.1f\n", sum/count);		
	}
}
