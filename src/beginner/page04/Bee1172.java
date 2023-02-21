package beginner.page04;

import java.util.Scanner;

public class Bee1172 {
	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			array[i] = s.nextInt();
			if (array[i] <= 0) array[i] = 1;
			System.out.println("X[" + i + "] = " + array[i]);
		}
		s.close();		
	}
}