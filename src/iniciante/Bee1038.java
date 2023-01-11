package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1038 {

	public static void main(String[] args) {
		int cod, qtd;
		Scanner s = new Scanner(System.in);
		cod = s.nextInt();
		qtd = s.nextInt();
		s.close();
		
		switch (cod) {
			case 1: {
				System.out.printf(Locale.US, "Total: R$ %.2f%n", qtd * 4.0);
				break;
			}
			case 2: {
				System.out.printf(Locale.US, "Total: R$ %.2f%n", qtd * 4.5);
				break;
			}
			case 3: {
				System.out.printf(Locale.US, "Total: R$ %.2f%n", qtd * 5.0);
				break;
			}
			case 4: {
				System.out.printf(Locale.US, "Total: R$ %.2f%n", qtd * 2.0);
				break;
			}
			case 5: {
				System.out.printf(Locale.US, "Total: R$ %.2f%n", qtd * 1.5);
				break;
			}
		}		
	}
}
