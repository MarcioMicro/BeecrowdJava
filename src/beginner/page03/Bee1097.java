package beginner.page03;

public class Bee1097 {

	public static void main(String[] args) {
		
		for (int I=1; I<=9; I+=2) {
			for (int J=6+I; J>=4+I; J--) {
				System.out.println("I=" + I + " J=" + J);				
			}
		}
	}
}
