package BasicVersion;

public class GameRunner {

    GamingConsole game;

    public GameRunner(GamingConsole superContraGame) {
        this.game = superContraGame;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.down();
        game.up();
        game.left();
        game.right();
    }

}
