package behavioral.observer.to_be;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Observer reader1 = new Subscriber("철수");
        Observer reader2 = new Subscriber("영희");

        /**
         * 느슨한 결합이 가능
         * Observer reader2 = new Subscriber("순자");
         * publisher.subscribe(reader3);
         */

        publisher.subscribe(reader1);
        publisher.subscribe(reader2);

        publisher.publish("뉴스 속보");
    }
}
