package behavioral.observer.to_be;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " 구독자가 뉴스 받음: " + news);
    }
}
