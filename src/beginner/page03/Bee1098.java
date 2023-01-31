package beginner.page03;

import java.text.DecimalFormat;

public class Bee1098 {

	public static void main(String[] args) {
		
		DecimalFormat output = new DecimalFormat("0.#");
		for (double I=0; I<=2; I+=0.2) {
			for (double J=1+I; J<=3+I; J++) {
				System.out.println("I=" + output.format(I) + " J=" + output.format(J));				
			}
		}
	}
}
