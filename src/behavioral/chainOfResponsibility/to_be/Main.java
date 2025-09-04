package behavioral.chainOfResponsibility.to_be;

public class Main {
    public static void main(String[] args) {
        // 체인 구성: INFO → DEBUG → ERROR
        LoggerHandler info = new InfoLogger();
        LoggerHandler debug = new DebugLogger();
        LoggerHandler error = new ErrorLogger();

        // 체인 연결
        info.setNext(debug);
        debug.setNext(error);

        info.handler("INFO", " 정보");
        info.handler("DEBUG", " 디버그");
        info.handler("ERROR", " 에러");
    }
}