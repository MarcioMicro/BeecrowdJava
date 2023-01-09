package iniciante;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		String teste = "agua", teste1, teste2;
		Scanner s = new Scanner(System.in);
		teste1 = s.findInLine(teste);
		teste2 = s.nextLine();
		s.close();
		
		System.out.println(teste1 + "\n" + teste2);
	}
}
