package Behavior.memento.shapes;

import java.awt.*;
import java.io.Serializable;

/**
 * @ClassName: Shape
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/4/2
 */
public interface Shape extends Serializable {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void drag();
    void drop();
    void moveTo(int x, int y);
    void moveBy(int x, int y);
    boolean isInsideBounds(int x, int y);
    Color getColor();
    void setColor(Color color);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}