package structural.decorator.as_is;

// 이메일 + SMS 사용시(클래스가 새로 필요함)
class EmailSmsNotifier extends BasicNotifier {
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("이메일 발송: " + message);
        System.out.println("SMS 발송: " + message);
    }
}