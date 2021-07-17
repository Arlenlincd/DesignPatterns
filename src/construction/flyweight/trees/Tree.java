package construction.flyweight.trees;

import java.awt.*;

/**
 * @ClassName: Tree
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }

}
