package structural.flyweight.to_be;

public class FlyweightTree {
    // 각 트리마다 상태(좌표)가 변함
    private final int x;
    private final int y;
    // 변하지 않는 상태 (공유)
    private final CommonTreeType treeType;

    public FlyweightTree(int x, int y, CommonTreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(x, y);
    }
}