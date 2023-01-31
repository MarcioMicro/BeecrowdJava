package beginner.page02;

import java.util.Scanner;

public class Bee1049 {

	public static void main(String[] args) {		
		
		String word1, word2, word3;
		Scanner s = new Scanner(System.in);
		word1 = s.next();
		word2 = s.next();
		word3 = s.next();
		s.close();
		
		if (word1.equals("vertebrado")) {
			if (word2.equals("ave")) {
				if (word3.equals("carnivoro"))System.out.println("aguia");
				else if (word3.equals("onivoro"))System.out.println("pomba");				
			}
			else if (word2.equals("mamifero")) {
				if (word3.equals("onivoro"))System.out.println("homem");
				else if (word3.equals("herbivoro"))System.out.println("vaca");				
			}			
		}
		if (word1.equals("invertebrado")) {
			if (word2.equals("inseto")) {
				if (word3.equals("hematofago"))System.out.println("pulga");
				else if (word3.equals("herbivoro"))System.out.println("lagarta");				
			}
			else if (word2.equals("anelideo")) {
				if (word3.equals("hematofago"))System.out.println("sanguessuga");
				else if (word3.equals("onivoro"))System.out.println("minhoca");				
			}			
		}
	}
}
