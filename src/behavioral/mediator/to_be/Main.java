package behavioral.mediator.to_be;

/**
 * Alice는 ChatRoom 객체에 메시지만 보내고, ChatRoom에서 핸들링하여 뿌려줌
 */
public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        UserColleague alice = new UserColleague("Alice", chatRoom);
        UserColleague bob = new UserColleague("Bob", chatRoom);
        UserColleague charlie = new UserColleague("Charlie", chatRoom);

        alice.send("안녕!");
        bob.send("반가워요!");
    }
}
