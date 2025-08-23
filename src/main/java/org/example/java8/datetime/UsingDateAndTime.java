package org.example.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class UsingDateAndTime {

    public static void main(String args[]) {
        LocalDate localDate = LocalDate.of(2020, Month.AUGUST, 10);
        System.out.println(localDate);

        localDate = localDate.plusDays(10).plusMonths(2).plusYears(5);
        System.out.println(localDate);


        LocalTime localTime = LocalTime.of(10, 30);
        System.out.println(localTime);

        localTime = localTime.plusHours(10).plusMinutes(5);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);

        localDateTime = localDateTime.plusHours(10).plusMinutes(5).plusWeeks(2).plusYears(10);
        System.out.println(localDateTime);
    }


}
