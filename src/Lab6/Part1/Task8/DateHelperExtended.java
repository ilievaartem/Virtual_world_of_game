package Lab6.Part1.Task8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateHelperExtended {
    private static DateHelper dateHelper;

    static {
        dateHelper = new DateHelper();
    }

    public static DateHelper getDateHelper() {
        return dateHelper;
    }

    public static long calculateDifference(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
}
