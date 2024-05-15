package Lab6.Part1.Task7;

import java.time.LocalDate;

public class Client {
    private boolean isWeekend(LocalDate date) {
        return DateUtils.isWeekend(date);
    }

    public void doSomething() {
        LocalDate currentDate = LocalDate.now();
        if (isWeekend(currentDate)) {
            System.out.println("It's weekend!");
        } else {
            System.out.println("It's not weekend!");
        }
    }
}
