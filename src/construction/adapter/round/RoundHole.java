package construction.adapter.round;

/**
 * @ClassName: RoundHole
 * @Description: 圆孔
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
