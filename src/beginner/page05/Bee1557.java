package beginner.page05;

import java.util.Scanner;

public class Bee1557 {
	public static void main(String[] args) {
		int N, digits;
		Scanner s = new Scanner(System.in);
				
		while ((N = s.nextInt())!=0) {			
			int[][] matrix = new int[N][N];
			
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					matrix[i][j] = (int) Math.pow(2, (i+j));
				}
			}
			
			digits = Integer.toString(matrix[N-1][N-1]).length();
			String format1 = "%" + digits + "d";
			String format2 = "%" + (digits+1) + "d";
			
			StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < N; i++) {
	            sb.append(String.format(format1, matrix[i][0]));
	            for (int j = 1; j < N; j++) {
	                sb.append(String.format(format2, matrix[i][j]));
	            }
	            sb.append("\n");
	        }
	        System.out.println(sb);
		}
		s.close();
	}
}