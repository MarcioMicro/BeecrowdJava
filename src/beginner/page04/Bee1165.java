package beginner.page04;

import java.util.Scanner;

public class Bee1165 
{
	public static void main(String[] args) 
	{
		int N, X;
		boolean isPrime;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		while (N-->0)
		{
			X = s.nextInt();
			isPrime = true;
			for (int i = 2; i<= X/2; i++)
			{
				if (X%i==0)
				{
					isPrime = false;
				}
			}
			if (isPrime) System.out.println(X + " eh primo");
			else System.out.println(X + " nao eh primo");
		}
		s.close();
	}
}
