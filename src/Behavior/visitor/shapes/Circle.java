package Behavior.visitor.shapes;

import Behavior.visitor.visitor.Visitor;

/**
 * @ClassName: Circle
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class Circle extends Dot {
    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
