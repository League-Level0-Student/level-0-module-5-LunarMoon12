package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_R0bot {
	public static Robot rob = new Robot();

	public static void main(String args[]) {

		rob.penDown();
		rob.setSpeed(100);
		rob.setPenColor(0, 0, 0);
		rob.show();

		String color = JOptionPane.showInputDialog("What color do you want?");

		if (color.equals("Red")) {
			rob.setPenColor(255, 0, 0);
		}

		if (color.equals("Green")) {
			rob.setPenColor(0, 255, 0);
		}

		if (color.equals("Blue")) {
			rob.setPenColor(0, 0, 255);
		}

		String shape = JOptionPane.showInputDialog("What shape do you want?");

		if (shape.equals("Square")) {
			drawSquare();
		}
		if (shape.equals("Triangle")) {
			drawTriangle();
		}

		if (shape.equals("Circle")) {
			drawCircle();
		}
	}

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.move(90);
			rob.turn(90);
		}
	}

	public static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			rob.move(90);
			rob.turn(120);
		}
	}

	public static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
		}
	}

}
