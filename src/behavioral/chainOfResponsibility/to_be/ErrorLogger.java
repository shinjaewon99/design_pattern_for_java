package behavioral.chainOfResponsibility.to_be;

public class ErrorLogger extends LoggerHandler {
    @Override
    protected boolean canNext(final String level) {
        return "ERROR".equals(level);
    }

    @Override
    protected void write(final String msg) {
        System.out.println("ERROR" + msg);
    }
}
