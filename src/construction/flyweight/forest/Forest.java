package construction.flyweight.forest;

import construction.flyweight.trees.Tree;
import construction.flyweight.trees.TreeFactory;
import construction.flyweight.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Forest
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
