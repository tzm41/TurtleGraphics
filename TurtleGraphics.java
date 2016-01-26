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
     * Initializes the application.  Programs call the init() method before
     * laying out the components in the window and the run() method after the
     * layout is complete.  This application is driven entirely by events
     * generated by the buttons and menus and does not need a run() method.
     */
    public void init() {
        turtle = new GTurtle();
        add(turtle);
        ui = new TurtleGraphicsUI();
        ui.start();
    }

    /*
     * Executes a turtle program, which consists of a string of commands.
     * Each command consists of a single letter, optionally followed by an
     * integer.  The commands you must implement for this assignment are
     *
     *    F#       Moves forward the specified number of pixels (default = 50)
     *    L#       Turn left the specified number of degrees (default = 90)
     *    R#       Turn right the specified number of degrees (default = 90)
     *    U        Raise the pen so that moving no longer draws a line
     *    D        Lower the pen to resume line drawing
     *    X#{cmds} Execute the block of commands the specified number of times
     */
    public void execute(String str) {
        // Fill this in
    }

    /*
     * Implements the Replace button action, which replaces all instances of a
     * pattern string in the current file with a replacement string.  The
     * pattern and replacement strings are taken from the replacement field in
     * the user interface, where they appear as pattern->replacement.
     */
    public void replaceAction() {
        // Fill this in
    }

/* Private instance variables */

    private GTurtle turtle;         /* The GTurtle object        */
    private TurtleGraphicsUI ui;    /* The user-interface object */
}
