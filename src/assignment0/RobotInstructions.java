package assignment0;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {

	/*
	 * Below you see a method called "act".
	 * It has one parameter, called "support.robot".
	 * For now, the way in which the code below fits into what you see on
	 * the screen will seem mysterious.  That's OK.
	 * 
	 * For now, please accept that the instructions below cause the support.robot to
	 * move forward, turn left, or turn right.
	 */
	public void act(RobotMotionAdapter robot) {
		
		/**
		 * Each of the following lines of code executes in turn.  The
		 * first line causes the support.robot to move forward 60 "pixels".  A pixel is
		 * a measurement of distance on a computer screen.
		 * 
		 * The second line causes the support.robot to turn left.  Based on what you see,
		 * what does "90" represent?
		 * 
		 * Run the program as instructed in the lab write-up and observe how the support.robot
		 * moves in response to the code you see below.
		 * 
		 * You will add instructions at the end of the code to cause the support.robot to move
		 * as you desire.
		 */
		robot.forward(60);
		robot.turnRight(90);
		robot.forward(100);
		robot.forward(50);
		robot.turnLeft(90);
		robot.forward(50);
		robot.turnRight(90);
		robot.forward(80);
		robot.turnRight(45);
		robot.forward(100);
		robot.turnRight(135);
		robot.forward(15);
		robot.turnRight(180);
		robot.forward(100);
		robot.turnRight(60);
		robot.forward(50);
		robot.turnRight(120);
		robot.turnLeft(90);
		robot.forward(30);
		robot.turnRight(90);
		robot.forward(400);
		robot.turnRight(75);
		robot.forward(60);
		robot.turnLeft(05);
		robot.forward(01);
		robot.turnRight(15);
		robot.forward(200);
		robot.turnLeft(90);
		robot.forward(200);
		robot.turnRight(90);
		robot.forward(100);
		robot.turnRight(90);
		robot.forward(200);
		robot.turnRight(90);
		robot.forward(125);
	}

}
