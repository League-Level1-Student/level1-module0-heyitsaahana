package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses { 
	
	Robot rob=new Robot();
	
	public void run() { 
		
		

		// Check the recipe to find out what code to put here
		rob.penDown();
		rob.setPenColor(0, 0, 255);
		rob.setSpeed(20);
		//		rob.moveTo(20, 600);
		//		rob.move(50);
		//		rob.turn(90);
		//		rob.move(100);
		//		rob.turn(280);
		//		rob.move(200);
		//		rob.turn(90);
		//		rob.move(50);
		//		rob.turn(90);
		//		rob.move(200);
		//		rob.setPenColor(0,255,0);
		//		rob.turn(90);
		//		rob.move(50);

	}
	
	void drawHouse(int height) {
	rob.moveTo(20, 600);
	rob.move(50);
	rob.turn(90);
	rob.move(100);
	rob.turn(280);
	rob.move(200);
	rob.turn(90);
	rob.move(50);
	rob.turn(90);
	rob.move(200);
	rob.setPenColor(0,255,0);
	rob.turn(90);
	rob.move(50);
	}
	
}






