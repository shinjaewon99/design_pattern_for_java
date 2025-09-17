package behavioral.mediator.to_be;

public interface ChatMediator {
    void sendMessage(String msg, UserColleague user);
    void addUser(UserColleague user);
}
