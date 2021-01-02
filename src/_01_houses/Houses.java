package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot bob = new Robot();
	
	public void run() {
		bob.hide();
		bob.setPenColor(0,255,0);
		bob.penDown();
		bob.setSpeed(1000000000);
		bob.turn(270);
		bob.move(50);
		bob.turn(180);
		bob.move(50);
		bob.turn(270);
		bob.setPenColor(255,0,0);
		bob.move(100);
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
		bob.move(100);
		bob.turn(270);
		bob.setPenColor(0,255,0);
		bob.move(50);
	}
}
