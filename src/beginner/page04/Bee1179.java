package beginner.page04;

import java.util.Scanner;

public class Bee1179 {
	public static void main(String[] args) {
		int[] par = new int[5];
		int[] impar = new int[5];
		int number, countPar=0, countImpar=0;
		Scanner s = new Scanner(System.in);
		for (int i=0; i<15; i++) {
			number = s.nextInt();
			if (number%2 == 0) {
				par[countPar] = number;
				countPar++;
			}
			else {
				impar[countImpar] = number;
				countImpar++;
			}
			if (countPar == 5) {
				for (int j=0; j<5; j++) System.out.println("par["+j+"] = "+par[j]);
				countPar = 0;
			}
			if (countImpar == 5) {
				for (int j=0; j<5; j++) System.out.println("impar["+j+"] = "+impar[j]);
				countImpar = 0;
			}
		}
		s.close();
		
		for (int j=0; j<countImpar; j++) System.out.println("impar["+j+"] = "+impar[j]);
		for (int j=0; j<countPar; j++) System.out.println("par["+j+"] = "+par[j]);		
	}
}
