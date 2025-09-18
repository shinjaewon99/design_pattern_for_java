package behavioral.observer.to_be;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void publish(String news) {
        System.out.println("발행된 뉴스: " + news);
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}
