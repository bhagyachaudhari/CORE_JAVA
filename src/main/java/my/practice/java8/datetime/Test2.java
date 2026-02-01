package my.practice.java8.datetime;

import java.time.*;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;

public class Test2 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2000, 10, 05);

        LocalDateTime localDateTime = LocalDateTime.of(2005, 10, 05, 12, 9, 40);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Australia/Sydney"));
        System.out.println(zonedDateTime);

        Period period = Period.of(2020, 05, 10);
        //Duration duration = Duration.between(1, 2);

        Instant instant = Instant.now(Clock.systemDefaultZone());
        System.out.println(instant);

    }
}
