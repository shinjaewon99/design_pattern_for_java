package behavioral.chainOfResponsibility.to_be;

public abstract class LoggerHandler {
    protected LoggerHandler next;

    public void setNext(LoggerHandler next) {
        this.next = next;
    }

    public void handler(String level, String msg) {
        if (canNext(level)) {
            write(msg);
        }// 본인(해당객체)의 책임을 넘김
        else if (next != null) {
            next.handler(level, msg);
        } else {
            System.out.println("UNKNOWN " + msg);
        }
    }

    protected abstract boolean canNext(String level);

    protected abstract void write(String msg);
}