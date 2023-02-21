package beginner.page05;

import java.util.Scanner;

public class Bee1534 {
	public static void main(String[] args) {
		int N;
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			N = s.nextInt();
			int[][] matrix = new int[N][N];
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) matrix[i][j] = 3;
			}
			for (int i=0; i<N; i++) matrix[i][i] = 1;
			for (int i=0; i<N; i++) matrix[N-i-1][i] = 2;
			
			StringBuilder sb = new StringBuilder();
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					sb.append(matrix[i][j]);
				}
				sb.append("\n");
			}
			System.out.print(sb);
		}
		s.close();
	}
}
