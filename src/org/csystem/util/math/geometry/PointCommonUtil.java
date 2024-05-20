// All Rights Free
// Copyleft (c) 1993 by C and System Programmers Association (CSD)
// Copyleft (c) 2024 kurth4cker <kurth4cker@gmail.com>

package org.csystem.util.math.geometry;

final class PointCommonUtil {
    private PointCommonUtil()
    {
    }

    public static double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static String toString(int x, int y)
    {
        return String.format("(%d, %d)", x, y);
    }
}
