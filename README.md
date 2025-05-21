# Robot Movement - Java Implementation

This Java program simulates a robot moving on a 5x4 grid.

## Problem Description
- The robot starts at position (0, 0, S).
- It takes a series of instructions as input (e.g., "MSMMEMM").
- 'N', 'S', 'E', 'W' - change direction (if not already facing it).
- 'M' - move forward one step in the current direction, unless it goes out of bounds.

## How to Compile and Run

### Step 1: Compile
```bash
javac Robot.java
```

### Step 2: Run
```bash
java Robot MSMMEMM
```

### Output
```
Robot Location: (3,3,E)
```

## Notes
- Grid is defined as 4 rows x 5 columns, zero-indexed.
- The robot doesn't move beyond the grid boundaries.
