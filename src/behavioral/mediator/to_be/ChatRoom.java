package behavioral.mediator.to_be;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private List<UserColleague> users = new ArrayList<>();

    @Override
    public void addUser(UserColleague user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String msg, UserColleague from) {
        for (UserColleague u : users) {
            if (u != from) { // 보낸 사람 제외
                u.receive(msg, from);
            }
        }
    }
}
