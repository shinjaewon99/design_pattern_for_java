package structural.decorator.to_be;

class SmsNotifier extends NotifierDecorator {
    public SmsNotifier(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
        System.out.println("SMS 발송: " + message);
    }
}