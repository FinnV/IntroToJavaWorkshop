package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class square {
public static void main(String[] args) {
	Robot the = new Robot();
the.penDown();
the.setSpeed(300);
the.setPenWidth(50);

the.setPenColor(Color.PINK);
	for (int i = 0; i < 4; i++) {
the.move(101);
the.turn(630);
}	
}
}
