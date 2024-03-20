package structural_design.adapter;

public class Adapter implements Game {
    private OldGame oldGame;

    public Adapter(OldGame oldGame) {
        this.oldGame = oldGame;
    }

    @Override
    public void play() {
        oldGame.start();
    }
}
