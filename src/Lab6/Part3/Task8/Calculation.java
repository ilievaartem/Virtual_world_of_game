package Lab6.Part3.Task8;

public class Calculation {
    public Double calculateAverage(int[] numbers) {
        if (numbers == null) {
            return null;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}
