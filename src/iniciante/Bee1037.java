package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1037 {
	
	public static void main(String[] args) {		
		double num;
		int ini, fim, fator;
		char sinal='(';
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		num = s.nextDouble();
		s.close();
		fator = (int) num/25;
		if (num%25 == 0 && num!=0) fator--;
		ini = 25*fator;
		fim = ini + 25;
		if (ini == 0) sinal = '[';
		if (num<0 || num>100) System.out.println("Fora de intervalo");
		else System.out.println("Intervalo " + sinal + ini + "," + fim + "]");
	}
}
