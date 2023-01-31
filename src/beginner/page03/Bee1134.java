package beginner.page03;

import java.util.Scanner;

public class Bee1134 {

	public static void main(String[] args) {
		
		int code=0, alcohol=0, gas=0, diesel=0;
		Scanner s = new Scanner(System.in);
				
		while (code !=4) {
			code = s.nextInt();
			if (code == 1) alcohol++;
			else if (code == 2) gas++;
			else if (code == 3) diesel++;
		}
		s.close();
		
		System.out.println("MUITO OBRIGADO\nAlcool: " + alcohol);
		System.out.println("Gasolina: " + gas + "\nDiesel: " + diesel);
	}
}
