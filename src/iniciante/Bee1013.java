package iniciante;

import java.util.Scanner;

public class Bee1013 {
	public static void main(String[] args) {
		int a, b, c, maiorAB, maiorABC;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		s.close();
		maiorAB = (a+b+Math.abs(a-b))/2;
		maiorABC = (maiorAB+c+Math.abs(maiorAB-c))/2;
		System.out.println(maiorABC + " eh o maior");
	}
}
