package beginner;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		int N, half, scope, end;
		String answer;
		Scanner s = new Scanner(System.in);
				
		while ((N = s.nextInt())!=0) {
			answer = "";
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
			for (int i = 0; i < N; i++) {
	            answer += String.format("%3d", matrix[i][0]);
	            for (int j = 1; j < N; j++) {
	                answer += String.format("%4d", matrix[i][j]);
	            }
	            answer += "\n";
	        }
	        System.out.println(answer);

		}
		s.close();
	}
}
