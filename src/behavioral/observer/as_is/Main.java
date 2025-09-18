package behavioral.observer.as_is;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber reader1 = new Subscriber("철수");
        Subscriber reader2 = new Subscriber("영희");

        publisher.publish("뉴스 속보", reader1, reader2);
    }
}
