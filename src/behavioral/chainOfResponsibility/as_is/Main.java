package behavioral.chainOfResponsibility.as_is;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("INFO", "정보");
        logger.log("DEBUG", "디버그");
        logger.log("ERROR", "에러");
    }
}