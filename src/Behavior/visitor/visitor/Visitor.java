package Behavior.visitor.visitor;

import Behavior.visitor.shapes.Circle;
import Behavior.visitor.shapes.CompoundShape;
import Behavior.visitor.shapes.Dot;
import Behavior.visitor.shapes.Rectangle;

/**
 * @ClassName: Visitor
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/28
 */
public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
