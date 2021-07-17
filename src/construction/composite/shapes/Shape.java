package construction.composite.shapes;

import java.awt.*;

/**
 * @ClassName: Shape
 * @Description: 通用形状接口
 * @Author: arlin
 * @Date: 2021/6/27
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}