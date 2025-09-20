package behavioral.state.to_be;

public class Player {
    private StateType state = StopState.getStopSingle(); // 초기 상태

    public void setState(StateType state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void stop() {
        state.stop(this);
    }
}
