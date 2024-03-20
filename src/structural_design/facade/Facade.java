package structural_design.facade;


public class Facade {
    private AudioSystem audioSystem;
    private RenderingSystem renderingSystem;
    private InputSystem inputSystem;

    public Facade() {
        this.audioSystem = new AudioSystem();
        this.renderingSystem = new RenderingSystem();
        this.inputSystem = new InputSystem();
    }

    public void startGame() {
        renderingSystem.renderScene();
        inputSystem.getInput();
        AudioSystem.audioSystem();
    }
}