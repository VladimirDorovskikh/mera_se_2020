package com.mera.lesson11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateTimeExample {


    public static void main(String[] args) {

        LocalDate endOfSummer = LocalDate.of(2019, Month.MARCH, 1);
        final LocalDate startOfAutumn = endOfSummer.plusDays(1);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        ZonedDateTime zdt = ZonedDateTime.now();
      //  System.out.println(zdt);

      //  System.out.println(startOfAutumn.with(TemporalAdjusters.lastDayOfMonth()));

    }
}
