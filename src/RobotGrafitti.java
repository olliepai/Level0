import org.jointheleague.graphical.robot.Robot;

public class RobotGrafitti {
	public static void main(String[] args) {
		Robot Bob = new Robot();
		
		Bob.moveTo(100, 500);
		Bob.penDown();
		Bob.move(200);
		Bob.turn(90);
		Bob.move(125);
		Bob.turn(90);
		Bob.move(200);
		Bob.turn(90);
		Bob.move(125);
		Bob.penUp();
		Bob.turn(180);
		Bob.move(200);
		Bob.turn(90);
		Bob.penDown();
		Bob.move(200);
		
		
	}
}
