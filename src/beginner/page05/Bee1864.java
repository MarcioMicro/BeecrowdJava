package beginner.page05;

import java.util.Scanner;

public class Bee1864 {
	public static void main(String[] args) {
		String text = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.close();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<N; i++) sb.append(text.charAt(i));
		System.out.println(sb);
	}
}
