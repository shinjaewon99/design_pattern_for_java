package behavioral.mediator.as_is;

/**
 * 객체들이 서로 직접 참조함에 따라 의존성이 높아짐
 */
public class Main {
    public static void main(String[] args) {
        User alice = new User("Alice");
        User bob = new User("Bob");

        alice.sendMessage("안녕 Bob!", bob);
        bob.sendMessage("안녕 Alice!", alice);
    }
}
