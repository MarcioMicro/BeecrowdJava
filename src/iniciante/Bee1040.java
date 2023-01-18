package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee1040 {

	public static void main(String[] args) {
		double n1, n2, n3, n4, exame, media, mediaFinal;
		Scanner s = new Scanner(System.in);
		n1 = s.nextDouble();
		n2 = s.nextDouble();
		n3 = s.nextDouble();
		n4 = s.nextDouble();
		media = (n1*2 + n2*3 + n3*4 + n4)/10;	
		DecimalFormat format = new DecimalFormat("#,#0.0");
		System.out.println("Media: " + format.format(media));
		if (media >= 7.0) System.out.println("Aluno aprovado.");
		else if (media < 5.0) System.out.println("Aluno reprovado.");
		else {
			System.out.println("Aluno em exame.");
			exame = s.nextDouble();
			System.out.printf("Nota do exame: %.1f%n", exame);
			mediaFinal = (media + exame)/2;
			if (mediaFinal <5.0) System.out.println("Aluno reprovado.");				
			else System.out.println("Aluno aprovado.");
			System.out.println("Media final: " + format.format(mediaFinal));			
		}
		s.close();
	}
}
