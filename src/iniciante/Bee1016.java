package iniciante;

import java.util.Scanner;

public class Bee1016 {
	public static void main(String[] args) {
		int X=60, Y=90, dist;
		int tempo;		
		Scanner s = new Scanner(System.in);
		dist = s.nextInt();
		s.close();
		tempo = (X*dist)/(Y-X);
		System.out.println(tempo + " minutos");
	}
}