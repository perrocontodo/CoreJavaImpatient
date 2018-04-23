/* 6. Repeat the preceding exercise, but now make translate and scale into mutators.
 */

package corejavaimpatient;

class PointMutator {
    private Double x;
    private Double y;

    PointMutator() {
        this.x = 0.0;
        this.y = 0.0;
    }

    PointMutator(Integer x, Integer y) {
        this.x = x.doubleValue();
        this.y = y.doubleValue();
    }

    PointMutator(Double x, Double y) {
        this.x = x;
        this.y = y;
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

    void translate(Integer x, Integer y) {
        setX(this.x + x);
        setY(this.y + y);
    }

    void scale(Double factor) {
        setX(this.x * factor);
        setY(this.y * factor);
    }
}
