package Behavior.visitor;

import Behavior.visitor.shapes.*;
import Behavior.visitor.visitor.XMLExportVisitor;

/**
 * 访问者是一种行为设计模式， 允许你在不修改已有代码的情况下向已有类层次结构中增加新的行为。
 * 1、如果你需要对一个复杂对象结构 （例如对象树） 中的所有元素执行某些操作， 可使用访问者模式。
 * 2、可使用访问者模式来清理辅助行为的业务逻辑。
 * 3、当某个行为仅在类层次结构中的一些类中有意义， 而在其他类中没有意义时， 可使用该模式。
 */
/**
 * @ClassName: Demo
 * @Description: 将形状导出为 XML 文件
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class Demo {

    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
