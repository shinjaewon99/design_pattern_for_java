package behavioral.chainOfResponsibility.to_be;

public class InfoLogger extends LoggerHandler {
    @Override
    protected boolean canNext(String level) {
        return "INFO".equals(level);
    }

    @Override
    protected void write(String msg) {
        System.out.println("INFO" + msg);
    }
}