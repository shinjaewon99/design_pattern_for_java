package creational.builder.as_is;

public class Main {
    public static void main(String[] args) {
        // 필요한 값만 넣고 싶어도 모든 인자를 순서대로 전달해야 함 OR
        // 추가로 해당 파라미터만 받는 생성자를 만들어야함
        User user1 = new User("u001", "홍길동", null, null, null);
        User user2 = new User("u002", "이순신", "lee@test.com", null, null);

        System.out.println(user1);
        System.out.println(user2);
    }
}