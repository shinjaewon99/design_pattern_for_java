package creational.prototype.to_be;


public class Main {
    public static void main(String[] args) {
        Character ch1 = new Character("히어로", "전사", 20);

        Character clone1 = ch1.clone();
        clone1.setName("파이터");

        Character clone2 = ch1.clone();
        clone2.setName("스피어맨");

        System.out.println(clone1.toString());
        System.out.println(clone2.toString());
    }
}