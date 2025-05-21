/**
 * Robot.java
 * 
 * A simple simulation of a robot that navigates a 5x4 grid.
 * 
 * Assumptions:
 * - The robot starts at (0, 0, S).
 * - Instructions come as a string of characters (e.g., MSMMEMM).
 * - Grid: 4 rows (0-3), 5 columns (0-4).
 * 
 * Instructions:
 * N, E, W, S - turn to face the given direction.
 * M - move one step in the current direction (if within bounds).
 * 
 * Author: iRobot Coding Challenge
 */

public class Robot {
    private static final int MAX_ROWS = 4;
    private static final int MAX_COLS = 5;

    private int row;
    private int col;
    private char direction;

    public Robot() {
        this.row = 0;
        this.col = 0;
        this.direction = 'S';
    }

    public void processCommands(String commands) {
        for (char command : commands.toCharArray()) {
            if (command == 'M') {
                move();
            } else if (isValidDirection(command)) {
                turn(command);
            }
        }
    }

    private boolean isValidDirection(char d) {
        return d == 'N' || d == 'S' || d == 'E' || d == 'W';
    }

    private void turn(char newDirection) {
        if (newDirection != this.direction) {
            this.direction = newDirection;
        }
        // else, already facing same direction; do nothing
    }

    private void move() {
        switch (direction) {
            case 'N':
                if (row > 0) row--;
                break;
            case 'S':
                if (row < MAX_ROWS - 1) row++;
                break;
            case 'E':
                if (col < MAX_COLS - 1) col++;
                break;
            case 'W':
                if (col > 0) col--;
                break;
        }
    }

    public void reportPosition() {
        System.out.printf("Robot Location: (%d,%d,%c)%n", row, col, direction);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a command string as argument.");
            return;
        }
        String input = args[0];
        Robot robot = new Robot();
        robot.processCommands(input);
        robot.reportPosition();
    }
}
