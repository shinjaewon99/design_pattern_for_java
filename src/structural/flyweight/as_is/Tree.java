package structural.flyweight.as_is;

public class Tree {
    private final String color;
    private final String texture;
    private final int x;
    private final int y;

    public Tree(String color, String texture, int x, int y) {
        this.color = color;
        this.texture = texture;
        this.x = x;
        this.y = y;
    }
    public void draw() {
        System.out.println("[" + color + " 나무] 위치 (" + x + "," + y + ") 텍스처:" + texture);
    }
}