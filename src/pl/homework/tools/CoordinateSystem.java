package pl.homework.tools;

import pl.homework.lib.Point;

public class CoordinateSystem {

    public boolean quaterOne(Point point)
    {
        return (point.getX() > 0 && point.getY() > 0);
    }

    public boolean quaterTwo(Point point)
    {
        return (point.getX() < 0 && point.getY() > 0);
    }

    public boolean quaterThree(Point point)
    {
        return (point.getX() < 0 && point.getY() < 0);
    }

    public boolean quaterFour(Point point)
    {
        return (point.getX() > 0 && point.getY() < 0);
    }

    public boolean axisX(Point point) {
        return (point.getX() == 0);
    }

    public boolean axisY(Point point) {
        return (point.getY() == 0);
    }

    public boolean center(Point point) {
        return (point.getX() == 0 && point.getY() == 0);
    }
}
