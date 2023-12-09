package _01_methods._1_houses;

import java.awt.Color;

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
		rob.moveTo(20, 500);
		//drawHouse(200);
		//drawHouse(150);
		//drawHouse(100);
		//drawHouse(250);
		//drawHouse(175);
		//drawHouse(75);
		//drawHouse(200);
		//drawHouse(115);
		//drawHouse(50);
		//drawHouse("small");
		//drawHouse("medium");
	//	drawHouse("large");
		drawHouse("small",Color.blue);
		drawHouse("medium",new Color(16,104,112));
		drawHouse("large",new Color(134, 84, 179));
		drawHouse("medium",new Color(157, 196, 190));
		drawHouse("large",new Color(194, 199, 153));
		drawHouse("small",new Color(177, 204, 155));
		drawHouse("large",new Color(113, 73, 156));
		drawHouse("medium",new Color(166, 85, 126));
		drawHouse("large",new Color(22, 145, 186));
		
		
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
	
	void drawHouse(int height,Color color) {
	rob.setPenColor(color);
	rob.move(height);
	rob.turn(90);
	rob.move(50);
	rob.turn(90);
	rob.move(height);
	rob.turn(-90);
	rob.setPenColor(0, 255, 0);
	rob.move(45);
	rob.turn(-90);
rob.setPenColor(0,0,255);
	}
	
	void drawHouse(String height,Color color) {
		
		if(height.equals("small")) {
			drawHouse(60,color);
			}
		if(height.equals("medium")) {
			drawHouse(120,color);
		}
		if(height.equals("large")) {
			drawHouse(250,color);
			
		}
	}
}







