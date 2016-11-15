// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;


import org.teachingextensions.logo.Tortoise;


public class SpiralMaker {


	public static void main(String[] args) {

		// 3. Make a variable to hold the number of sides and set it to 0
		int x = 0;
		int side = 0;
		Tortoise.setSpeed(10);
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String spiral = JOptionPane.showInputDialog("What typ of spiral would you like ... square, triangle, or pentagon?");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if (spiral.equals("square")) {
			side = 4;
		}
		if (spiral.equals("triangle")) {
			side = 3;
		}
		if (spiral.equals("pentagon")) {
			side = 5;
		}
		
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		for (int i = 0; i < 999999999; i++) {
			int y = new Random().nextInt(360);
			Tortoise.penDown();
			Tortoise.move(10);
			Tortoise.turn(y);
			x += 1;
		}
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}


}




