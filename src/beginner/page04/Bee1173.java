package beginner.page04;

import java.util.Scanner;

public class Bee1173 {
	public static void main(String[] args) {
		int[] N = new int[10];
		Scanner s = new Scanner(System.in);
		N[0] = s.nextInt();
		s.close();
		for(int i=1; i<10; i++) N[i] = N[i-1]*2;
		for(int i=0; i<10; i++) System.out.println("N[" + i + "] = " + N[i]);
	}
}
