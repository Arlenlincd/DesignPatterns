package creation.prototype.cache;

import creation.prototype.shapes.Circle;
import creation.prototype.shapes.Rectangle;
import creation.prototype.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: BundledShapeCache
 * @Description: 原型注册站
 *              实现中心化的原型注册站 （或工厂）， 其中包含一系列预定义的原型对象。
 *              这样一来， 你就可以通过传递对象名称或其他参数的方式从工厂处获得新的对象。
 *              工厂将搜索合适的原型， 然后对其进行克隆复制， 最后将副本返回给你。
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class BundledShapeCache {

    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
