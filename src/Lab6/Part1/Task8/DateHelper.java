package Lab6.Part1.Task8;

import java.time.LocalDate;

public class DateHelper {
    public static LocalDate addDays(LocalDate date, int days) {
        return date.plusDays(days);
    }

}
