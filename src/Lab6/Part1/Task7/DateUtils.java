package Lab6.Part1.Task7;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateUtils {
    public static boolean isWeekend(LocalDate date) {
        return date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY;
    }
}
