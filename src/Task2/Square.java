package Task2;

import java.awt.*;
import java.util.Scanner;
public class Square {
    private static final Point point1X = new Point(-4, 5 );
    private static final Point point1Y = new Point(4, 0 );
    private static final Point point2X = new Point(-6, 0 );
    private static final Point point2Y = new Point(6, -4 );

    private static boolean doesPointBelong(final Point point) {
        return (point.x >= point1X.x && point.x <= point1Y.x) && (point.y <= point1X.y && point.y >= point1Y.y) ||
                (point.x >= point2X.x && point.x <= point2Y.x) && (point.y <= point2X.y && point.y >= point2Y.y);
    }

    public static void main(String[] args) {
        System.out.println("Enter x and y");
        try (Scanner sc = new Scanner(System.in)) {
            Point point = new Point(sc.nextInt(), sc.nextInt());
            System.out.println(doesPointBelong(point));
        }
    }
}
