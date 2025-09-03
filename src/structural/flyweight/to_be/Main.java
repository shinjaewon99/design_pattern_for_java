package structural.flyweight.to_be;


public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long before = runtime.totalMemory() - runtime.freeMemory();

        FlyweightTree[] trees = new FlyweightTree[1_000_000];
        CommonTreeType tree = TreeFactory.getTreeType("초록", "소나무");

        for (int i = 0; i < trees.length; i++) {
            trees[i] = new FlyweightTree(i % 100, i / 100, tree);
        }

        long after = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("메모리 사용량 (TO-BE): " + (after - before) / 1024 + " KB");
    }
}