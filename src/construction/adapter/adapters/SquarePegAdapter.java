package construction.adapter.adapters;

import construction.adapter.round.RoundPeg;
import construction.adapter.square.SquarePeg;

/**
 * @ClassName: SquarePegAdapter
 * @Description: 方钉到圆孔的适配器
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}