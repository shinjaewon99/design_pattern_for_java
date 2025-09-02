package structural.decorator.as_is;

class EmailNotifier extends BasicNotifier {
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("이메일 발송: " + message);
    }
}