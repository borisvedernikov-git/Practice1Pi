package Practice1Circle;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int pointsNumber = sc.nextInt();

        int radius = 1;
        int sumCircle = 0;

        for (int i = 0; i < pointsNumber; i++) {
            if (insideCircle(pointGenerator(-1, 1, -1, 1), radius)) sumCircle++;
        }

        double piNum = 4.0 * ((double) sumCircle / pointsNumber);
        System.out.println("Estimated Pi is: " + piNum);
    }

    static Point pointGenerator(int xLeft, int xRight, int yBottom, int yTop) {
        Random random = new Random();
        double x = xLeft + (xRight - xLeft) * random.nextDouble();
        double y = yBottom + (yTop - yBottom) * random.nextDouble();
        return new Point(x, y);
    }

    static boolean insideCircle(Point point, double radius) {
        double x = point.getXValue();
        double y = point.getYValue();
        return (Math.pow(x, 2) + Math.pow(y, 2)) <= Math.pow(radius, 2);
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getXValue() {
        return x;
    }
    public double getYValue() {
        return y;
    }
}