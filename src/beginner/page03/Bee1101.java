package beginner.page03;

import java.util.Scanner;

public class Bee1101 {

	public static void main(String[] args) {
		
		int M, N, sum;
		Scanner s = new Scanner(System.in);
		M = s.nextInt();
		N = s.nextInt();
		
		while (M>0 && N>0) {
			sum = 0;
			if (M>N) {
				M = M + N;
				N = M - N;
				M = M - N;
			}
			for (int i=M; i<=N; i++) {
				System.out.print(i + " ");
				sum += i;
			}
			System.out.println("Sum=" + sum);
			M = s.nextInt();
			N = s.nextInt();			
		}		
		s.close();
	}
}
