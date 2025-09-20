package behavioral.state.to_be;

public class StopState implements StateType {
    private static final StopState STOP_SINGLE = new StopState();

    private StopState() {
    }

    public static StopState getStopSingle() {
        return STOP_SINGLE;
    }

    @Override
    public void play(final Player player) {
        System.out.println("재생");
        player.setState(PlayState.getInstance());
    }

    @Override
    public void stop(Player player) {
        System.out.println("이미 정지 상태입니다.");
    }
}
