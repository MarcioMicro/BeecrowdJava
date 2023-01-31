package beginner.page02;

import java.util.Scanner;

public class Bee1066 {

	public static void main(String[] args) {
		
		int value, even=0, odd=0, positive=0, negative=0;
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			value = s.nextInt();
			if (value%2==0) even++;
			else odd++;
			if (value<0) negative++;
			else if (value>0) positive++;
		}
		s.close();
		
		System.out.println(even + " valor(es) par(es)");
		System.out.println(odd + " valor(es) impar(es)");
		System.out.println(positive + " valor(es) positivo(s)");
		System.out.println(negative + " valor(es) negativo(s)");
	}
}
