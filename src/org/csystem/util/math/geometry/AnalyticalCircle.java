// All Rights Free
// Copyleft (c) 1993 by C and System Programmers Association (CSD)
// Copyleft (c) 2024 kurth4cker <kurth4cker@gmail.com>

package org.csystem.util.math.geometry;

public class AnalyticalCircle extends Circle {
    private final MutablePoint center;

    public AnalyticalCircle(double radius)
    {
        this(radius, 0, 0);
    }

    public AnalyticalCircle(int x, int y)
    {
        this(0, x, y);
    }

    public AnalyticalCircle(double radius, int x, int y)
    {
        super(radius);
        this.center = new MutablePoint(x, y);
    }

    public int getX()
    {
        return this.center.getX();
    }

    public void setX(int x)
    {
        this.center.setX(x);
    }

    public int getY()
    {
        return this.center.getY();
    }

    public void setY(int y)
    {
        this.center.setY(y);
    }

    public void set(int x, int y)
    {
        setX(x);
        setY(y);
    }

    public boolean isTangent(AnalyticalCircle other)
    {
        //TODO:
        return true;
    }

    public boolean isInside(int x, int y)
    {
        return this.center.distance(x, y) <= getRadius();
    }

    public void offset(int dxy)
    {
        offset(dxy, dxy);
    }

    public void offset(int dx, int dy)
    {
        this.center.offset(dx, dy);
    }

    public double radiusDistance(AnalyticalCircle other)
    {
        return this.center.distance(other.center);
    }
}
