package behavioral.observer.as_is;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void receive(String news) {
        System.out.println(name + " 구독자가 뉴스 받음: " + news);
    }
}
