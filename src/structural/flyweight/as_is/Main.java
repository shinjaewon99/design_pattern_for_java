package structural.flyweight.as_is;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long before = runtime.totalMemory() - runtime.freeMemory();

        Tree[] trees = new Tree[1_000_000];

        for (int i = 0; i < trees.length; i++) {
            // 모든 나무가 같은 색상, 텍스처를 가진다고 가정해도 개별적으로 생성
            trees[i] = new Tree("초록", "소나무", i % 100, i / 100);
        }

        long after = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("메모리 사용량 (AS-IS): " + (after - before) / 1024 + " KB");
    }
}