package beginner.page03;

import java.util.Scanner;

public class Bee1094 {

	public static void main(String[] args) {
		
		int N, amount, rabbits=0, rats=0, frogs=0, total=0;
		char type;
		double pRabbits, pRats, pFrogs;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		
		while (N-->0) {
			amount = s.nextInt();
			type = s.next().charAt(0);
			if (type == 'C') rabbits += amount;
			else if (type == 'R') rats += amount;
			else if (type == 'S') frogs += amount;
			total += amount;			
		}
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + rabbits);
		System.out.println("Total de ratos: " + rats);
		System.out.println("Total de sapos: " + frogs);
		
		pRabbits = (double) rabbits/total*100;
		pRats = (double) rats/total*100;
		pFrogs = (double) frogs/total*100;
		
		System.out.printf("Percentual de coelhos: %.2f %%\n", pRabbits);
		System.out.printf("Percentual de ratos: %.2f %%\n", pRats);
		System.out.printf("Percentual de sapos: %.2f %%\n", pFrogs);
		
		s.close();
				
	}
}
