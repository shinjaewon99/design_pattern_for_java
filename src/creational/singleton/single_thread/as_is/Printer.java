package creational.singleton.single_thread.as_is;

// 매번 new 인스턴스로 객체 생성
public class Printer {
    public void print(String message){
        System.out.println(message);
    }
}