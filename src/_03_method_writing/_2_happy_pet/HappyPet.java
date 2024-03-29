package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String pet;

	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		 pet = JOptionPane.showInputDialog("What pet do you want?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!

		// 4. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your pet happy", "Happy Pet",
				0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cuddle", "Feed", "Groom" }, null);

		// 6. Use user input to call the appropriate method created in step 5 below.

		// 7. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	public static void petReaction() {
		
		// Each method should create a pop-up with the pet's response (eg. cat might
		// purr when pet),
		// and INCREMENT the pet's happiness Level.
		if (pet.equals("Dog")) {
			JOptionPane.showMessageDialog(null,"Woof! Your dog is happy!");
			happinessLevel = +30;
		}
		if (pet.equals("Cat")) {
			JOptionPane.showMessageDialog(null, "Meow! Your cat is happy");
		happinessLevel = +20;
		}
		if (pet.equals("Rabbit")) {
			JOptionPane.showMessageDialog(null, "Purr! You're rabbit is happy!");
			happinessLevel = +30;
		}
	}
}