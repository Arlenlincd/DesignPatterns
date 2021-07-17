package Behavior.visitor.shapes;

import Behavior.visitor.visitor.Visitor;

/**
 * @ClassName: Shape
 * @Description: 通用形状接口
 * @Author: arlin
 * @Date: 2021/6/28
 */
public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
