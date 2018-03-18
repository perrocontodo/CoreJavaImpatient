/* 1. Change the calendar printing program so it starts the week on a Sunday.
 * Also make it print a newline at the end (but only one).
 */

package corejavaimpatient;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Cal {

    public static void printCalendar(String[] args) {
        LocalDate date = LocalDate.now().withDayOfMonth(1);
        int month;
        if (args.length >= 2) {
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year, month, 1);
        } else {
            month = date.getMonthValue();
        }

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.plus(1L).getValue();
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().plus(1L).getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
        System.out.println();
    }
}
