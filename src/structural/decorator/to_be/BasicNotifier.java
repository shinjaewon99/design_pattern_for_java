package structural.decorator.to_be;

class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("기본 알림: " + message);
    }
}