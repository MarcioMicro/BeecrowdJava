package beginner.page01;

import java.util.Scanner;
import java.util.Locale;

public class Bee1021 {
	public static void main(String[] args) {
		int cedula, moeda;
		double valor;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		valor = s.nextDouble();
		s.close();
		cedula = (int) valor;
		moeda = (int) (valor*100%100);
		System.out.println("NOTAS:");
		System.out.println(cedula/100 + " nota(s) de R$ 100.00");
		cedula %= 100;
		System.out.println(cedula/50 + " nota(s) de R$ 50.00");
		cedula %= 50;
		System.out.println(cedula/20 + " nota(s) de R$ 20.00");
		cedula %= 20;
		System.out.println(cedula/10 + " nota(s) de R$ 10.00");
		cedula %= 10;
		System.out.println(cedula/5 + " nota(s) de R$ 5.00");
		cedula %= 5;
		System.out.println(cedula/2 + " nota(s) de R$ 2.00");
		if (cedula%2 != 0) moeda += 100;
		
		System.out.println("MOEDAS:");
		System.out.println(moeda/100 + " moeda(s) de R$ 1.00");
		moeda %= 100;
		System.out.println(moeda/50 + " moeda(s) de R$ 0.50");
		moeda %= 50;
		System.out.println(moeda/25 + " moeda(s) de R$ 0.25");
		moeda %= 25;
		System.out.println(moeda/10 + " moeda(s) de R$ 0.10");
		moeda %= 10;
		System.out.println(moeda/5 + " moeda(s) de R$ 0.05");
		moeda %= 5;
		System.out.println(moeda/1 + " moeda(s) de R$ 0.01");
	}
}
