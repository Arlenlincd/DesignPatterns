package construction.composite;

import construction.composite.editor.ImageEditor;
import construction.composite.shapes.Circle;
import construction.composite.shapes.CompoundShape;
import construction.composite.shapes.Dot;
import construction.composite.shapes.Rectangle;

import java.awt.*;

/**
 * 组合模式是一种结构型设计模式， 你可以使用它将对象组合成树状结构， 并且能像使用独立对象一样使用它们。
 */
/**
 * @ClassName: Demo
 * @Description: 简单组合图形
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Demo {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

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
                        new Dot(360, 240, Color.GREEN),
                        new CompoundShape(
                                new Circle(240, 240, 50, Color.RED),
                                new Dot(340, 340, Color.RED)
                        )
                )
        );
    }
}
