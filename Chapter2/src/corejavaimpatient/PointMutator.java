/* 6. Repeat the preceding exercise, but now make translate and scale into mutators.
 */

package corejavaimpatient;

/** A <code>Point</code> object represents point, with x and y coordinates.
 * @author David Catanho
 * @version 1.0
 * @see <a href="http://horstmann.com/javaimpatient/">"Core Java for the Impatient"</a>
 */
class PointMutator {
    private Double x;
    private Double y;

    private PointMutator() {
        this.x = 0.0;
        this.y = 0.0;
    }

    PointMutator(Integer x, Integer y) {
        PointMutator newPoint = new PointMutator();
        this.x = newPoint.getX() + x;
        this.y = newPoint.getY() + y;
    }

    Double getX() {
        return x;
    }

    Double getY() {
        return y;
    }

    private void setX(Double x) {
        this.x = x;
    }

    private void setY(Double y) {
        this.y = y;
    }

    /**
     * Moves the point to a new x and y coordinates.
     * @param x move coordinate x this amount
     * @param y move coordinate y this amount
     * @see corejavaimpatient.Point#translate(Integer, Integer)
     */
    void translate(Integer x, Integer y) {
        setX(this.x + x);
        setY(this.y + y);
    }

    /**
     * "Grows" the point by a specified factor
     * @param factor how much to increase the coordinates
     * @see corejavaimpatient.Point#scale(Double)
     */
    void scale(Double factor) {
        setX(this.x * factor);
        setY(this.y * factor);
    }
}
