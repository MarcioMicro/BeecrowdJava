package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1009 {
	public static void main(String[] args) {
		double salario, vendas;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		s.next();
		salario = s.nextDouble();
		vendas = s.nextDouble();
		s.close();
		System.out.printf(Locale.US, "TOTAL = R$ %.2f%n", salario + vendas*0.15);
	}
}