package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot bob = new Robot();

	public void run() {
		setup();
	
		String housie = JOptionPane.showInputDialog(null, "What size do you want your house to be? Small, medium, or large?");

		if (housie.equalsIgnoreCase("small")) {
		drawCasita (); 
		}
		if (housie.equalsIgnoreCase("medium")) {
			drawHouse();
		}
	}
    private void setup() {
		bob.penDown();
		bob.hide();
		bob.setSpeed(1000000000);
		bob.setWindowColor(Color.BLACK);
	}

	private void drawHouse() {
		bob.penDown();
		bob.setPenColor(0,255,0);
		bob.turn(270);
		bob.move(25);
		bob.turn(180);
		bob.move(100);
		bob.turn(180);
		bob.move(75);
		bob.turn(90);
		bob.setPenColor(255,0,0);
		bob.move(100);
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
		bob.move(100);
		bob.turn(270);
	}
	private void drawCasita () {
		
		bob.setPenColor(0,255,0);
		bob.turn(90);
		bob.move(40);
		bob.turn(180);
		bob.move(20);
		bob.turn(90);
		bob.setPenColor(255,0,0);
		bob.move(45);
		bob.turn(90);
		bob.move(20);
		bob.turn(90);
		bob.move(45);
		bob.setPenColor(0,255,0);
		bob.turn(270);
		bob.move(20);
	}
	private void drawHome () {

		bob.setPenColor(0,255,0);
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
	}
