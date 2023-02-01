package _01_algorithms._2_fibonacci;

public class Fibonnaci {

	public static void main(String args[]) {
		int num_1 = 0;
		int num_2 = 1;
		int sum;
		System.out.println(num_1 +"\n"+ num_2);
		for (int i = 0; i < 10; i++) {
sum = num_1 + num_2;
			System.out.println(sum);
			num_1 = num_2;
			num_2 = sum;
		}
	}
}
