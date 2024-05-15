package Lab6.Part4.Task13;

public class Calculator {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе");
        }
        return dividend / divisor;
    }

}
