// All Rights Free
// Copyleft (c) 1993 by C and System Programmers Association (CSD)
// Copyleft (c) 2024 kurth4cker <kurth4cker@gmail.com>

package org.csystem.util.math.geometry;

public class Point {
    private final int x;
    private final int y;

    public Point()
    {
        this(0, 0);
    }

    public Point(int x)
    {
        this(x, 0);
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }


    public double distance()
    {
        return distance(0, 0);
    }

    public double distance(Point other)
    {
        return distance(other.x, other.y);
    }

    public double distance(int x, int y)
    {
        return PointCommonUtil.distance(this.x, this.y, x, y);
    }

    public Point offset(int dxy)
    {
        return offset(dxy, dxy);
    }

    public Point offset(int dx, int dy)
    {
        return new Point(this.x + dx, this.y + dy);
    }

    public MutablePoint toMutablePoint()
    {
        return new MutablePoint(this.x, this.y);
    }

    public String toString()
    {
        return PointCommonUtil.toString(this.x, this.y);
    }
}
