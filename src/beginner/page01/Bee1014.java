package beginner.page01;

import java.util.Locale;
import java.util.Scanner;

public class Bee1014 {
	public static void main(String[] args) {
		int X;
		double Y;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		X = s.nextInt();
		Y = s.nextDouble();
		s.close();
		System.out.printf(Locale.US, "%.3f km/l\n", X/Y);
	}
}
