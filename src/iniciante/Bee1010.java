package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1010 {
	public static void main(String[] args) {
		int qtd1, qtd2;		
		double valor1, valor2;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		qtd1 = s.nextInt();
		valor1 = s.nextDouble();
		qtd2 = s.nextInt();
		valor2 = s.nextDouble();
		s.close();
		System.out.printf(Locale.US, "VALOR A PAGAR: R$ %.2f%n", qtd1*valor1 + qtd2*valor2);
	}
}