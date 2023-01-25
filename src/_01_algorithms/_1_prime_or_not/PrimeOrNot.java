package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String args[]) {
		String number = JOptionPane.showInputDialog("Enter a number!");
		int num = Integer.parseInt(number);

		boolean prime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
			}

		}
		if (prime) {
			JOptionPane.showMessageDialog(null, "You're number is prime!");
		} else {
			JOptionPane.showMessageDialog(null, "You're number is not prime!");}
	}
}
