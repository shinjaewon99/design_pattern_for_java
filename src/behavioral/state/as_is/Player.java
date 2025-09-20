package behavioral.state.as_is;

public class Player {
    private String state = "STOP";

    public void play() {
        if (state.equals("STOP")) {
            System.out.println("재생");
            state = "PLAY";
        } else if (state.equals("PLAY")) {
            System.out.println("정지");
            state = "PAUSE";
        } else if (state.equals("PAUSE")) {
            System.out.println("다시 재생");
            state = "PLAY";
        }
        // 상태가 늘어잘수록 if-else문이 길어짐
    }

    public void stop() {
        if (!state.equals("STOP")) {
            System.out.println("정지");
            state = "STOP";
        }
    }
}
