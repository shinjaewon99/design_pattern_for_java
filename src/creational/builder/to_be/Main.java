package creational.builder.to_be;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.Builder("user001", "홍길동")
                .build(); // 선택값 없이도 가능

        User user2 = new User.Builder("user002", "이순신")
                .email("lee@test.com")
                .phone("010-1234-5678")
                .address("서울시 강남구")
                .build();

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}