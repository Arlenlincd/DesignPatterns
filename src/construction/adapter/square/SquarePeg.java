package construction.adapter.square;

/**
 * @ClassName: SquarePeg
 * @Description: 方钉
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
