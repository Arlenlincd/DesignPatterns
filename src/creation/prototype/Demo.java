package creation.prototype;

/**
 * 原型是一种创建型设计模式， 使你能够复制对象， 甚至是复杂对象， 而又无需使代码依赖它们所属的类。
 */

import creation.prototype.cache.BundledShapeCache;
import creation.prototype.shapes.Circle;
import creation.prototype.shapes.Rectangle;
import creation.prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Demo
 * @Description: 复制图形
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Demo {

    public static void main(String[] args) {
//        shapes();
        cache(); // 使用原型注册站
    }

    public static void shapes() {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }

    /**
     * 原型注册站
     * 你可以实现中心化的原型注册站 （或工厂）， 其中包含一系列预定义的原型对象。
     * 这样一来， 你就可以通过传递对象名称或其他参数的方式从工厂处获得新的对象。
     * 工厂将搜索合适的原型， 然后对其进行克隆复制， 最后将副本返回给你。
     */
    public static void cache() {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Medium blue rectangle (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }
    }
}
