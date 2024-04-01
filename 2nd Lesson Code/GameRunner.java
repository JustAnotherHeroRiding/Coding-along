
public class GameRunner {

    MarioGame game;

    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.down();
        game.up();
        game.left();
        game.right();
    }

}
