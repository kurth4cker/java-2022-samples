// All Rights Free
// Copyleft (c) 1993 by C and System Programmers Association (CSD)
// Copyleft (c) 2024 kurth4cker <kurth4cker@gmail.com>

package org.csystem.util.math.geometry;

public class Circle {
    private double radius;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        setRadius(radius);
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = Math.abs(radius);
    }

    public double getArea()
    {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * this.radius;
    }
}
