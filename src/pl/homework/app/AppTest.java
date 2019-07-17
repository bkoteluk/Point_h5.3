package pl.homework.app;

import pl.homework.lib.Segment;
import pl.homework.lib.Point;
import pl.homework.tools.*;

public class AppTest {

    public String printPoints(Point point1, Point point2) {
        return "(x1, y1) = (" + point1.getX() + ", " + point1.getY() + ") i " +
                "(x2, y2) = (" + point2.getX() + ", " + point2.getY() + ")";
    }

    public String printPoints(Point point1, Point point2, Point point3) {
        return printPoints(point1, point2) +
                "(x3, y3) = (" + point3.getX() + ", " + point3.getY() + ")";
    }

    public String printSegmentTest(SegnentTools segmentTools, Segment segment, Point point1, Point point2) {
        return "Długość odcinka o współrzędnych:  " + printPoints(point1, point2) +
                " jest równa " + segmentTools.segmentLength(segment.getPoint1(), segment.getPoint2());
    }

    public String printTriangleTest(SegnentTools segmentTools, Point point1, Point point2, Point point3) {
        return "Punkty o współrzędnych " + printPoints(point1, point2, point3) +
                (segmentTools.isTriangle(point1,point2,point3)? "tworzą trójkąt": "nie tworzą trójkąta");
    }


    public static void main(String[] args) {
        AppTest app = new AppTest();
        Point point1 = new Point(0,0);
        Point point2 = new Point(5, 4);
        Point point3 = new Point(6, 8);
        CoordinateSystem coordinateSystem = new CoordinateSystem();

        System.out.println("Punkt: (x,y) = (" + point2.getX() + ", " + point2.getY() + ") :" );
        System.out.println(coordinateSystem.quaterOne(point2)? "leży w pierwszej ćwiartce układu współrzędnych": "nie leży w pierwszej ćwiartce układu współrzędnych" );
        System.out.println(coordinateSystem.quaterTwo(point2)? "leży w drugiej ćwiartce układu współrzędnych": "nie leży w drugiej ćwiartce układu współrzędnych" );
        System.out.println(coordinateSystem.quaterThree(point2)? "leży w trzeciej ćwiartce układu współrzędnych": "nie leży w trzeciej ćwiartce układu współrzędnych" );
        System.out.println(coordinateSystem.quaterFour(point2)? "leży w czwartej ćwiartce układu współrzędnych": "nie leży w czwartej ćwiartce układu współrzędnych" );
        System.out.println(coordinateSystem.axisX(point2)? "leży na osi X układu współrzędnych": "nie leży na osi X układu współrzędnych" );
        System.out.println(coordinateSystem.axisY(point2)? "leży na osi Y układu współrzędnych": "nie leży na osi Y układu współrzędnych" );
        System.out.println(coordinateSystem.center(point2)? "leży w środku układu współrzędnych": "nie leży w środku X układu współrzędnych" );
        Segment segment = new Segment(point1, point3);
        SegnentTools segmentTools = new SegnentTools();


//        System.out.println("Długość odcinka o współrzędnych: (x1, y1) = (" + segment.getPoint1().getX() + ", "
//                + segment.getPoint1().getY() + ") i (x2, y2) = (" + segment.getPoint2().getX() + ", " + segment.getPoint1().getY() + ")" +
//                " jest równa " + segmentTools.segmentLength(segment.getPoint1(), segment.getPoint2()) );
//        System.out.print("Punkty o współrzędnych (x1,y1) = (" + point1.getX() + ", " + point1.getY() + ") (x2, y2) = (" +
//                + point2.getX() + ", " + point2.getY() + ") (x3,y3) = (" + point3.getX() + ", " + point3.getY() + ") ");
//        System.out.println(segmentTools.isTriangle(point1,point2,point3)? "tworzą trójkąt": "nie tworzą trójkąta");

        System.out.println(app.printSegmentTest(segmentTools, segment,point1,point2));
        System.out.println(app.printTriangleTest(segmentTools, point1, point2, point3));
    }
}
