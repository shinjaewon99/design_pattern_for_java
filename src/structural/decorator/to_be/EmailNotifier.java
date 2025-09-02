package structural.decorator.to_be;

class EmailNotifier extends NotifierDecorator {
    public EmailNotifier(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
        System.out.println("이메일 발송: " + message);
    }
}