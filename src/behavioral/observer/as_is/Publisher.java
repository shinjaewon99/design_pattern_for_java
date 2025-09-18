package behavioral.observer.as_is;

public class Publisher {
    private String news;

    public void publish(String news, Subscriber reader1, Subscriber reader2) {
        this.news = news;
        // 구독자가 늘어나면 코드도 늘어나야 함 (확장성이 떨어짐)
        reader1.receive(news);
        reader2.receive(news);

        /**
         * reader3.receive(news);
         * reader4.receive(news);
         * ...
         */
    }
}
