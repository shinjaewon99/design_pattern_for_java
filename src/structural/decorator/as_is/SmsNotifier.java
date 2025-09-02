package structural.decorator.as_is;

class SmsNotifier extends BasicNotifier {
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS 발송: " + message);
    }
}