package Lab6.Part4.Task8;

public class Processor {
    private Calculator calculator;

    public Processor(Calculator calculator) {
        this.calculator = calculator;
    }

    public int process() {
        return calculator.add(getX(), getY());
    }

    private int getX() {

        return 1;
    }

    private int getY() {

        return 10;
    }
}
