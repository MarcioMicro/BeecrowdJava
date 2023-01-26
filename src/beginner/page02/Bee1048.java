package beginner.page02;

import java.util.Scanner;

public class Bee1048 {

	public static void main(String[] args) {
		
		double initialSalary, increasedSalary, newSalary;
		int percentIncrease;
		Scanner s = new Scanner(System.in);
		initialSalary = s.nextDouble();
		s.close();
		
		if(initialSalary <= 400) percentIncrease = 15;
		else if(initialSalary <= 800) percentIncrease = 12;
		else if(initialSalary <= 1200) percentIncrease = 10;
		else if(initialSalary <= 2000) percentIncrease = 7;
		else percentIncrease = 4;
		
		increasedSalary = (initialSalary*percentIncrease)/100;
		newSalary = initialSalary + increasedSalary;
		
		System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n"
				+ "Em percentual: %d %%\n", newSalary, increasedSalary, percentIncrease);
		
	}
}
