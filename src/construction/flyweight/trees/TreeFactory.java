package construction.flyweight.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TreeFactory
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
