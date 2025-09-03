package structural.flyweight.to_be;

public class CommonTreeType {
    private final String color;
    private final String texture;

    public CommonTreeType(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("[" + color + " 나무] 위치 (" + x + "," + y + ") 텍스처:" + texture);
    }
}