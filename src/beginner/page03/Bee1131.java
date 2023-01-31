package beginner.page03;

import java.util.Scanner;

public class Bee1131 {

	public static void main(String[] args) {
		
		int gGoals, iGoals, gVic=0, iVic=0, draws=0, ng=1;
		Scanner s = new Scanner(System.in);
		
		while (ng==1) {
			iGoals = s.nextInt();
			gGoals = s.nextInt();
			if (iGoals > gGoals) iVic++;
			else if (gGoals > iGoals) gVic++;
			else draws++;
			System.out.println("Novo grenal (1-sim 2-nao)");
			ng = s.nextInt();
		}
		s.close();
		System.out.println((iVic + gVic + draws) + " grenais");
		System.out.println("Inter:" + iVic);
		System.out.println("Gremio:" + gVic);
		System.out.println("Empates:" + draws);
		
		if (iVic > gVic) System.out.println("Inter venceu mais");
		else if (gVic > iVic) System.out.println("Gremio venceu mais");
		else System.out.println("Não houve vencedor");		
	}
}
