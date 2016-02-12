package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot he = new Robot();
		
he.penDown();

		he.setSpeed(10);
		// 4. Do the following (steps 7-9) 75 times
for (int i = 0; i < 75; i++) {
he.setRandomPenColor();


}
			
	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	
he.move(5*i);			
he.turn(300);	
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i

	}
}