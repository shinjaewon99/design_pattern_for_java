package structural.decorator.to_be;

public class Main {
    public static void main(String[] args) {
        Notifier basic = new BasicNotifier();

        // 이메일만
        Notifier email = new EmailNotifier(basic);
        email.send("할 일 있음!");

        // SMS만
        Notifier sms = new SmsNotifier(basic);
        sms.send("할 일 있음!");

        // Email + SMS 조합 → 클래스 새로 만들 필요 없음
        // Email 템플릿에 SMS 템플릿도 끼어 맞춤
        Notifier emailSms = new SmsNotifier(new EmailNotifier(basic));
        emailSms.send("할 일 있음!");
    }
}