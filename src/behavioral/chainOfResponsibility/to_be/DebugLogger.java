package behavioral.chainOfResponsibility.to_be;

public class DebugLogger extends LoggerHandler {
    @Override
    protected boolean canNext(String level) {
        return "DEBUG".equals(level);
    }

    @Override
    protected void write(String msg) {
        System.out.println("DEBUG " + msg);
    }
}
