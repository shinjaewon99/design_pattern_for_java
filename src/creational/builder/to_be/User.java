package creational.builder.to_be;

public class User {
    private final String id;      // 필수
    private final String name;    // 필수
    private final String email;   // 선택
    private final String phone;   // 선택
    private final String address; // 선택

    // private 생성자: 빌더만 접근 가능
    // @Builder 라는 어노테이션으로 축약 가능
    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Builder 클래스 (static inner class)
    public static class Builder {
        private final String id;   // 필수
        private final String name; // 필수
        private String email;
        private String phone;
        private String address;

        public Builder(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
