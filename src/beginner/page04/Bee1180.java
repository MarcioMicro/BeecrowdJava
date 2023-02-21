package beginner.page04;

import java.util.Scanner;

public class Bee1180 {
	public static void main(String[] args) {
		int N, smallerNumber, index;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		int[] X = new int[N];
		for (int i=0; i<N; i++) X[i] = s.nextInt();
		s.close();
		
		smallerNumber = X[0];
		index = 0;
		for (int i=1; i<N; i++) {
			if (X[i] < smallerNumber) {
				smallerNumber = X[i];
				index = i;
			}
		}
		System.out.println("Menor valor: " + smallerNumber);
		System.out.println("Posicao: " + index);
	}
}
