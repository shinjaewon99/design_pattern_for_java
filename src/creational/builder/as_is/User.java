package creational.builder.as_is;

public class User {
    private String id; // 필수
    private String name; // 필수
    private String email; // 선택
    private String phone; // 선택
    private String address; // 선택

    // 생성자 (모든필드)
    public User(String id, String name, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
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