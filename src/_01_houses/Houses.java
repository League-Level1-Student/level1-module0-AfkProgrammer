package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot bob = new Robot();
	
	public void run() {
		String housie = JOptionPane.showInputDialog(null, "What size do you want your house to be? Small, medium, or large?");
		if (housie.equalsIgnoreCase("small")) {
		
		}
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
		for(int i = 0; i <= 10; i++) {
			drawHouse();
		}
		bob.setPenColor(0,255,0);
		bob.move(50);
		}

	private void drawHouse() {
		bob.move(100);
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
		bob.move(100);
		bob.turn(270);
	}
	
}
