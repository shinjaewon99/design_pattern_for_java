package behavioral.state.to_be;


public class PlayState implements StateType {
    private static final PlayState PLAY_SINGLE = new PlayState();

    private PlayState() {
    }

    public static PlayState getInstance() {
        return PLAY_SINGLE;
    }

    @Override
    public void play(Player player) {
        System.out.println("일시정지");
    }

    @Override
    public void stop(Player player) {
        System.out.println("정지");
        player.setState(StopState.getStopSingle());
    }
}
