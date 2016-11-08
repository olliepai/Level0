import java.util.Random;

import org.jointheleague.graphical.robot.Robot;


public class Spiral {


	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot bob = new Robot();
		// 5. Set your robot's pen to the down position
		bob.penDown();

		// 3. Set the robot to go at max speed (10)
		bob.setSpeed(10);

		// 4. Repeat the code below 75 times (you’ll need to move the mustache!)
		for (int i = 1; i > 0; i ++) {
			int x = new Random().nextInt(100);
			int y = new Random().nextInt(100);
			int z = new Random().nextInt(100);
			// 7. Change the pen color to random
			bob.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			bob.move(x);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			bob.turn(y);
		
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
			bob.setPenWidth(z);
		}
	}
}