package beginner.page05;

import java.util.Scanner;

public class Bee1789 {
	public static void main(String[] args) {
		int L, V, level, maxLevel;
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			L = s.nextInt();
			maxLevel = 1;
			while (L-->0) {
				V = s.nextInt();
				if (V>=20) {
					level = 3;
					if (level>maxLevel) maxLevel = level;
				}
				if (V>=10) {
					level = 2;
					if (level>maxLevel) maxLevel = level;
				}
			}
			System.out.println(maxLevel);
		}		
		s.close();
	}
}
