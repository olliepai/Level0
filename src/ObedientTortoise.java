import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise ugly = new Tortoise();
		ugly.setSpeed(10);
		String shape = JOptionPane.showInputDialog("What shape would you like to draw? Square, triangle, or square?");
		String color = JOptionPane.showInputDialog("What color would you like your shape to be? Red, Green, or Blue?");
		if (shape.equals("Square")) {
			if (color.equals("Red")) {
				Tortoise.setPenColor(Color.red);
				drawSquare();
			}
			else if (color.equals("Green")) {
				Tortoise.setPenColor(Color.green);
				drawSquare();
			}
			else if (color.equals("blue")) {
				Tortoise.setPenColor(Color.blue);
				drawSquare();
			}
		}
		else if (shape.equals("Triangle")) {
			if (color.equals("Red")) {
				Tortoise.setPenColor(Color.red);
				drawTriangle();
			}
			else if (color.equals("Green")) {
				Tortoise.setPenColor(Color.green);
				drawTriangle();
			}
			else if (color.equals("blue")) {
				Tortoise.setPenColor(Color.blue);
				drawTriangle();
			}
		}
		else if (shape.equals("Circle")) {
			if (color.equals("Red")) {
				Tortoise.setPenColor(Color.red);
				drawCircle();
			}
			else if (color.equals("Green")) {
				Tortoise.setPenColor(Color.green);
				drawCircle();
			}
			else if (color.equals("blue")) {
				Tortoise.setPenColor(Color.blue);
				drawCircle();
			}
		}
	}
	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);
		}
	}
	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(100);
			Tortoise.turn(180);
		}
	}
	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			Tortoise.move(2);
			Tortoise.turn(1);
		}
	}
}
