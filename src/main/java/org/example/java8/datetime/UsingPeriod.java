package org.example.java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {

    public static void main(String args[]){
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);

        Period period = Period.ofWeeks(1);
        //cleanAnimalCage(start, end);
        cleanAnimalCage(start, end, period);

        System.out.println(start.plus(period));

        //Period yearAndMonth = Period.ofYears(1);
        Period yearAndMonth = Period.of(1,1,1);
        System.out.println(yearAndMonth);
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period){
        while(start.isBefore(end)){
            System.out.println("Need to clean the cage on date : "+start);
            start = start.plus(period);
        }
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end){
        while(start.isBefore(end)){
            System.out.println("Need to clean the cage on date : "+start);
            start = start.plusMonths(1);
        }
    }
}
