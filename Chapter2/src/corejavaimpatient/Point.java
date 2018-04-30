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

/** A <code>Point</code> object represents point, with x and y coordinates.
  * @author David Catanho
  * @version 1.0
  * @see <a href="http://horstmann.com/javaimpatient/">"Core Java for the Impatient"</a>
  */
class Point {
    private Double x;
    private Double y;

    private Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    Point(Integer x, Integer y) {
        Point newPoint = new Point();
        this.x = newPoint.getX() + x;
        this.y = newPoint.getY() + y;
    }

    private Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }


    Double getX() {
        return x;
    }

    Double getY() {
        return y;
    }

    /**
     * Moves the point to a new x and y coordinates.
     * @param x move coordinate x this amount
     * @param y move coordinate y this amount
     * @return new Point with x and y moved to the new coordinates
     */
    Point translate(Integer x, Integer y) {
        return new Point(this.x + x, this.y + y);
    }

    /**
     * "Grows" the point by a specified factor
     * @param factor how much to increase the coordinates
     * @return new Point with x and y increased by the factor
     */
    Point scale(Double factor) {
        return new Point(this.x * factor, this.y * factor);
    }
}
