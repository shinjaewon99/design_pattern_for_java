package behavioral.state.as_is;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        player.play();
        player.play();
        player.stop();
    }
}
