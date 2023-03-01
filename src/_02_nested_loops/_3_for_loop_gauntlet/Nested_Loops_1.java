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
			for(int x = 1; x <= 100; x++) {
				if (x % 1 == 1) {
					System.out.println(x + " ");
				}
			}
		}
	}
}