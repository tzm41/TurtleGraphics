
/*
 * File: TurtleGraphics.java
 * -------------------------
 * This file represents the starter file for the TurtleGraphics application.
 * Your job in Assignment #4 is to complete this application by implementing
 * the execute and replaceAction methods.  You also need to implement the
 * TurtleScanner class in the file TurtleScanner.java.
 */

import acm.program.*;

public class TurtleGraphics extends GraphicsProgram {

	/* Constants to set the application size */
	public static final int APPLICATION_WIDTH = 1000;
	public static final int APPLICATION_HEIGHT = 600;

	/*
	 * Initializes the application. Programs call the init() method before
	 * laying out the components in the window and the run() method after the
	 * layout is complete. This application is driven entirely by events
	 * generated by the buttons and menus and does not need a run() method.
	 */
	public void init() {
		turtle = new GTurtle();
		add(turtle);
		ui = new TurtleGraphicsUI();
		ui.start();
	}

	/*
	 * Executes a turtle program, which consists of a string of commands. Each
	 * command consists of a single letter, optionally followed by an integer.
	 * The commands you must implement for this assignment are
	 *
	 * F# Moves forward the specified number of pixels (default = 50) L# Turn
	 * left the specified number of degrees (default = 90) R# Turn right the
	 * specified number of degrees (default = 90) U Raise the pen so that moving
	 * no longer draws a line D Lower the pen to resume line drawing X#{cmds}
	 * Execute the block of commands the specified number of times
	 */
	public void execute(String str) {
		// Fill this in
		TurtleTokenizer turtleTok = new TurtleTokenizer(str);
		while (turtleTok.hasMoreTokens()) {

			String currentToken = turtleTok.nextToken();
			char command = currentToken.charAt(0); // get letter command
			String dx = currentToken.substring(1);

			// identify command and run it
			if (command == 'f') {
				if (dx.equals(""))
					turtle.forward(50);
				else
					turtle.forward(Double.parseDouble(dx));

			} else if (command == 'l') {

				if (dx.equals(""))
					turtle.left(90);
				else
					turtle.left(Double.parseDouble(dx));

			} else if (command == 'r') {

				if (dx.equals(""))
					turtle.right(90);
				else
					turtle.right(Double.parseDouble(dx));

			} else if (command == 'u') {
				turtle.penUp();
			} else if (command == 'd') {
				turtle.penDown();
			} else if (command == 'x') {

				// check for braces
				int repeats = Integer.parseInt(dx);
				String temp = turtleTok.nextToken();
				// get rid of braces
				String nextToken = temp.substring(1, temp.length() - 1);

				// recursively evaluate all the repeats
				for (int i = 0; i < repeats; i++) {
					execute(nextToken);
				}

			} else
				continue; // invalid command
		}
	}

	/*
	 * Implements the Replace button action, which replaces all instances of a
	 * pattern string in the current file with a replacement string. The pattern
	 * and replacement strings are taken from the replacement field in the user
	 * interface, where they appear as pattern->replacement.
	 */
	public void replaceAction() {
		String text = ui.getProgramText();
		String replace = ui.getReplacementField();
		String[] strings = replace.split("\\s+?->\\s+?");
		ui.setProgramText(text.replaceAll(strings[0], strings[1]));
	}

	/* Private instance variables */

	private GTurtle turtle; /* The GTurtle object */
	private TurtleGraphicsUI ui; /* The user-interface object */
}
