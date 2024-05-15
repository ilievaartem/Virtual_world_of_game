package Lab6.Part4.Task5;

public class Calculator {
    public int calculate(int num, int pow) {
    int result = 1;

    for (int i = 0; i < pow; i++) {
        result *= num;
    }

    return result;
}
}
