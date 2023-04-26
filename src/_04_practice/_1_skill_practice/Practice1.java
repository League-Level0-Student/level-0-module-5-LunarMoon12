package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Practice1 {
	public static void main(String args[]) {

		Practice1 skills = new Practice1();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int cents = Integer.parseInt(dimes);
		JOptionPane.showMessageDialog(null, "You have" + cents * 10 + "cents");
		String height = JOptionPane.showInputDialog("How tall are you?");
		int int_height = Integer.parseInt(height);
		int int_heigh;
		if (int_height < 36) {
			JOptionPane.showMessageDialog(null, "You should eat your wheaties!");
		}
	}

	void skill2() {
		for (int i = 0; i < 30; i++) {
			if (i % 3 == 0) {
				JOptionPane.showMessageDialog(null, i);
			}
		}
	}

	void skill3() {
		int random = new Random().nextInt(20);
		JOptionPane.showMessageDialog(null, random);
		int random1 = new Random().nextInt(10);
		JOptionPane.showMessageDialog(null, random1);
		JOptionPane.showMessageDialog(null, random - random1);
	}

	void skill4() {
		String city = JOptionPane.showInputDialog("What city do you live in?");
		if (city.equals("San Diego")) {
JOptionPane.showMessageDialog(null,"You live in America's Finest City!");
		}
	 JOptionPane.showMessageDialog(null, "My car is a silver, 4 door, sedan, with a horsepower of 174.");
		
	}

	void skill5() {
String school = JOptionPane.showInputDialog("What is your school's name?");
JOptionPane.showMessageDialog(null, school + " is a fantastic school!");
	}
}
