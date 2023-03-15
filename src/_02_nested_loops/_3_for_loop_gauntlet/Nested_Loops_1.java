package _02_nested_loops._3_for_loop_gauntlet;

public class Nested_Loops_1 {

	public static void main(String args[]) {

		for (int i = 0; i < 100; i++) {
			System.out.println(" " + i + " ");
		}
		for (int y = 100; y >= 0; y--) {
			System.out.println(" " + y + " ");
		}
		for (int z = 2; z <= 100; z++) {
			if (z % 2 == 0) {
				System.out.println(z + " ");
			}
		}
		for (int x = 1; x <= 100; x++) {
			if (x % 1 == 1) {
				System.out.println(x + " ");
			}
		}
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " " + "This number is odd.");
			}

			if (i % 2 == 0) {
				System.out.println(i + " " + "This number is even.");
			}
		}

		for (int i = 7; i <= 777; i++) {
			if (i % 7 == 0) {
				System.out.println(i + " ");
			}
		}
		for (int i = 0; i <= 11; i++) {
			System.out.println((i + 2012) + " I was " + i);
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		int x = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(x);
				x++;
			}
			System.out.println();
		}
	}
}