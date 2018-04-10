/* 5. Implement an immutable class Point that describes a point in the plane. Provide a constructor
 * to set it to a specific point, a no-arg constructor to set it to the origin, and methods getX, getY,
 * translate, and scale. The translate method moves the point by a given amount in x- and y-direction.
 * The scale method scales both coordinates by a given factor. Implement these methods so that they
 * return new points with the results. For example,
 *
 *     Point p = new Point(3, 4).translate(1, 3).scale(0.5);
 *
 * should set p to a point with coordinates (2, 3.5).
 */

package corejavaimpatient;

class Point {
    private Double x;
    private Double y;

    Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    Point(Integer x, Integer y) {
        this.x = x.doubleValue();
        this.y = y.doubleValue();
    }

    Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }


    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    Point translate(Integer x, Integer y) {
        return new Point(this.x + x, this.y + y);
    }

    Point scale(Double factor) {
        return new Point(this.x * factor, this.y * factor);
    }
}
