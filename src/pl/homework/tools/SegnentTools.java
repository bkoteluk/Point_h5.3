package pl.homework.tools;

import pl.homework.lib.Point;

public class SegnentTools {
    public double segmentLength(Point point1, Point point2) {
        double sideA;
        double sideB;
//
        sideA = point1.getX() >= point2.getX() ? point1.getX()-point2.getX() : point2.getX()-point1.getX();
        sideB = point1.getY() >= point2.getY() ? point1.getY()-point2.getY() : point2.getY()-point1.getY();

        return Math.sqrt(sideA*sideA + sideB*sideB);
    }

    public boolean isTriangle(Point point1, Point point2, Point point3) {
        double sideA;
        double sideB;
        double sideC;

        sideA = segmentLength(point1, point2);
        sideB = segmentLength(point2, point3);
        sideC = segmentLength(point1, point3);
//        w trójkącie suma długości dwóch boków jest zawsze większa od długości trzeciego boku
        return (sideA + sideB) > sideC;
    }
}
