package structural.flyweight.to_be;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, CommonTreeType> treeTypes = new HashMap<>();

    public static CommonTreeType getTreeType(String color, String texture) {
        String key = color + "-" + texture;
        // 색깔과 텍스처가 같지 않다면 담는다.
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new CommonTreeType(color, texture));
        }
        return treeTypes.get(key);
    }
}