package beginner.page05;

import java.util.Scanner;

public class Bee1828 {
	public static void main(String[] args) {
		int T;
		String sheldon, raj;
		Scanner s = new Scanner(System.in);
		T = s.nextInt();
		
		for (int i=0; i<T; i++) {
			sheldon = s.next();
			raj = s.next();
			if (sheldon.equals(raj)) System.out.println("Caso #"+(i+1)+": De novo!");
			else if (sheldon.equals("pedra") && (raj.equals("lagarto") || raj.equals("tesoura")))
					System.out.println("Caso #"+(i+1)+": Bazinga!");
			else if (sheldon.equals("papel") && (raj.equals("pedra") || raj.equals("Spock")))
				System.out.println("Caso #"+(i+1)+": Bazinga!");
			else if (sheldon.equals("tesoura") && (raj.equals("papel") || raj.equals("lagarto")))
				System.out.println("Caso #"+(i+1)+": Bazinga!");
			else if (sheldon.equals("lagarto") && (raj.equals("Spock") || raj.equals("papel")))
				System.out.println("Caso #"+(i+1)+": Bazinga!");
			else if (sheldon.equals("Spock") && (raj.equals("tesoura") || raj.equals("pedra")))
				System.out.println("Caso #"+(i+1)+": Bazinga!");
			else System.out.println("Caso #"+(i+1)+": Raj trapaceou!");
		}
		s.close();
	}
}
