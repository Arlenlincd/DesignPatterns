package Behavior.memento;

import Behavior.memento.editor.Editor;
import Behavior.memento.shapes.Circle;
import Behavior.memento.shapes.CompoundShape;
import Behavior.memento.shapes.Dot;
import Behavior.memento.shapes.Rectangle;

import java.awt.*;

/**
 * 备忘录模式 - 备忘录是一种行为设计模式，允许生成对象状态的快照并在以后将其还原。
 */
/**
 * @ClassName: Demo
 * @Description: 形状编辑器和复杂的撤销/恢复功能
 * @Author: arlin
 * @Date: 2021/4/2
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}