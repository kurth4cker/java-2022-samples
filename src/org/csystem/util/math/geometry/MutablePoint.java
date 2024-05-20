// All Rights Free
// Copyleft (c) 1993 by C and System Programmers Association (CSD)
// Copyleft (c) 2024 kurth4cker <kurth4cker@gmail.com>

package org.csystem.util.math.geometry;

public class MutablePoint {
    private int x;
    private int y;

    public MutablePoint()
    {
    }

    public MutablePoint(int x)
    {
        this.x = x;
    }

    public MutablePoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return this.x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return this.y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public double distance()
    {
        return distance(0, 0);
    }

    public double distance(MutablePoint other)
    {
        return distance(other.getX(), other.getY());
    }

    public double distance(int x, int y)
    {
        return PointCommonUtil.distance(this.x, this.y, x, y);
    }

    public void offset(int dxy)
    {
        offset(dxy, dxy);
    }

    public void offset(int dx, int dy)
    {
        this.x += dx;
        this.y += dy;
    }

    public Point toPoint()
    {
        return new Point(this.x, this.y);
    }

    public String toString()
    {
        return PointCommonUtil.toString(this.x, this.y);
    }
}
