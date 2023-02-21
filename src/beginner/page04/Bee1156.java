package beginner.page04;

public class Bee1156 {

	public static void main(String[] args) {
		
		double S=0;
		for (int i=1, j=0; i<=39; i+=2, j++) S += i/Math.pow(2.0, j);
		System.out.printf("%.2f\n", S);
	}
}
