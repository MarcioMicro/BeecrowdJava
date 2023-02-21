package beginner.page05;

import java.util.Scanner;

public class Bee1478 {
	public static void main(String[] args) {
		int N;
		Scanner s = new Scanner(System.in);
				
		while ((N = s.nextInt())!=0) {			
			int[][] matrix = new int[N][N];
			
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					matrix[i][j] = Math.abs(i-j) + 1;
				}
			}
			
			StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < N; i++) {
	            sb.append(String.format("%3d", matrix[i][0]));
	            for (int j = 1; j < N; j++) {
	                sb.append(String.format("%4d", matrix[i][j]));
	            }
	            sb.append("\n");
	        }
	        System.out.println(sb);

		}
		s.close();
	}
}