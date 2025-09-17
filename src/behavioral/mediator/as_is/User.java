package behavioral.mediator.as_is;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String msg, User to) {
        System.out.println(this.name + " -> " + to.name + " : " + msg);
        to.receiveMessage(msg, this);
    }

    public void receiveMessage(String msg, User from) {
        System.out.println(this.name + "님이 " + from.name + "로부터 메시지 수신: " + msg);
    }
}
