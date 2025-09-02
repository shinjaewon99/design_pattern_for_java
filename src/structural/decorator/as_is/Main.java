package structural.decorator.as_is;

public class Main {
    public static void main(String[] args) {
        Notifier n1 = new EmailNotifier();
        n1.send("할 일 있음!");

        Notifier n2 = new SmsNotifier();
        n2.send("할 일 있음!");

        // Email + SMS 조합은 새 클래스 필요
        Notifier n3 = new EmailSmsNotifier();
        n3.send("할 일 있음!");
    }
}