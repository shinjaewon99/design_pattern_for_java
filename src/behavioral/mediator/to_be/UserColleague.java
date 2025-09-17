package behavioral.mediator.to_be;

public class UserColleague {
    private String name;
    private ChatMediator mediator;

    public UserColleague(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addUser(this);
    }

    public void send(String msg) {
        System.out.println(this.name + "가 메시지 전송: " + msg);
        mediator.sendMessage(msg, this);
    }

    public void receive(String msg, UserColleague from) {
        System.out.println(this.name + "님이 " + from.name + "로부터 메시지 수신: " + msg);
    }
}
