package beginner.page01;

import java.util.Locale;
import java.util.Scanner;

public class Bee1008 {
	public static void main(String[] args) {
		int numero, horas;
		double valor;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		numero = s.nextInt();
		horas = s.nextInt();
		valor = s.nextDouble();
		s.close();
		System.out.printf(Locale.US, "NUMBER = %d%nSALARY = U$ %.2f%n", numero, horas*valor);
	}
}
