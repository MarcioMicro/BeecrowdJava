package beginner.page04;

import java.util.Scanner;

public class Bee1164 
{
	public static void main(String[] args) 
	{
		int N, X, sum;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		while (N-->0)
		{
			X = s.nextInt();
			sum = 0;
			for (int i = 1; i<= X/2; i++)
			{
				if (X%i==0)
				{
					sum += i;
				}
			}
			if (X == sum) System.out.println(X + " eh perfeito");
			else System.out.println(X + " nao eh perfeito");
		}
		s.close();
	}
}
