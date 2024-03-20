package structural_design.bridge;

public class PCPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Гра на платформі ПК");
    }
}