package behavioral.chainOfResponsibility.as_is;

public class Logger {
    // if-else 가 길어지고, 새로운 조건이 추가되면 Main 코드가 수정됨
    public void log(String level, String message) {
        if ("INFO".equals(level)) {
            System.out.println("INFO " + message);
        } else if ("DEBUG".equals(level)) {
            System.out.println("DEBUG " + message);
        } else if ("ERROR".equals(level)) {
            System.out.println("ERROR " + message);
        } else {
            System.out.println("UNKNOWN " + message);
        }
    }
}