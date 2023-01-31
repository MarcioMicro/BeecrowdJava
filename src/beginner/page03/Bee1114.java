package beginner.page03;

import java.util.Scanner;

public class Bee1114 {

	public static void main(String[] args) {
		
		int correctPass=2002, pass;
		Scanner s = new Scanner(System.in);
		pass = s.nextInt();
		
		while (pass != correctPass) {
			System.out.println("Senha Invalida");
			pass = s.nextInt();
		}
		s.close();
		System.out.println("Acesso Permitido");		
	}
}
