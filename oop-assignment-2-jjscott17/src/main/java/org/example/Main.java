package org.example;

public class Main {
    public static void main(String[] args) {
        PyramidRubik cube = new PyramidRubik();
        cube.display();
        System.out.println("\nRotating...");
        System.out.println("Left clockwise:");
        cube.rotateLeftClockwise(0);
        cube.display();
        System.out.println("Right clockwise:");
        cube.rotateRightClockwise(1);
        cube.display();
        System.out.println("Left Counter clockwise");
        cube.rotateLeftCounterClockwise(2);
        cube.display();
        System.out.println("Right Counter clockwise");
        cube.rotateRightCounterClockwise(3);
        cube.display();
        System.out.println("Top clockwise");
        cube.rotateTopClockwise(0);
        cube.display();
        System.out.println("Top Counter clockwise");
        cube.rotateTopCounterClockwise(0);
        cube.display();
        System.out.println("\nScrambling:");
        cube.scramble();
        cube.display();
    }
}
