package beginner.page05;

import java.util.Scanner;

public class Bee1827 {
	public static void main(String[] args) {
		int N;
		Scanner s = new Scanner(System.in);
		
		while (s.hasNext()) {
			N = s.nextInt();
			int[][] matrix = new int[N][N];
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) matrix[i][j] = 0;
			}
			for (int i=0; i<N; i++) {
				matrix[i][i] = 2;
				matrix[N-i-1][i] = 3;
			}
			int start1 = N/3;
			for (int i=start1; i<N-start1; i++) {
				for (int j=start1; j<N-start1; j++) matrix[i][j] = 1;
			}
			matrix[N/2][N/2] = 4;
			
			StringBuilder sb = new StringBuilder();			
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) sb.append(matrix[i][j]);
				sb.append("\n");
			}
			System.out.println(sb);
		}		
		s.close();
	}
}
