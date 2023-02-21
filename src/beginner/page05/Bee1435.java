package beginner.page05;

import java.util.Scanner;

public class Bee1435 {
	public static void main(String[] args) {
		int N, half, scope, end;
		Scanner s = new Scanner(System.in);
				
		while ((N = s.nextInt())!=0) {
			half = N/2;
			scope=0;
			int[][] matrix = new int[N][N];
			while (scope<=half) {
				end = N-scope;
				for (int i=scope; i<end; i++) {
					for (int j=scope; j<end; j++) {
						matrix[i][j]++;
					}
				}
				scope++;
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