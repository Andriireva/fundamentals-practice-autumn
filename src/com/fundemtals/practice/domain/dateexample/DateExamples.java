package com.fundemtals.practice.domain.dateexample;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// 1970
public class DateExamples {

    public static void main(String[] args) {
        // Date is an old date representation class
        Date date = new Date();
        long oneDay = 1000L * 60 * 60 * 24;
        long _30days = 1000L * 60 * 60 * 24 * 30;
        long oneYear = 1000L * 60 * 60 * 24 * 365;
        Date date2 = new Date(oneYear);
        Date date3 = new Date(date2.getTime() + oneDay);
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date3);

        System.out.println("==== Instant =====" );
        // java8 Date - Instant
        // Instant store the date without timezone
        Instant now = Instant.now();
//        now.atZone(ZoneId.of())
        Instant date3ToInstant = date3.toInstant(); // convert old Date to java8 Instant type
        Instant nowAnd30Days = now.plus(30, ChronoUnit.DAYS);
        Instant nowAnd3Hour = now.plus(3, ChronoUnit.HOURS);
        Instant nowMinusHour = now.minus(3600, ChronoUnit.SECONDS);
//        Instant nowandyear = now.plus(1, ChronoUnit.YEARS);  // with years it is no possible
//        Instant nowandyear = now.plus(1, ChronoUnit.MONTHS);  // with years it is no possible
        // 2020 -

        // atOffset convert to OffsetDateTime (which includes time zone)
        OffsetDateTime nowKyivTime = now.atOffset(ZoneOffset.of("+2"));

//        now.isAfter(nowMinusHour);

        System.out.println(now);
        System.out.println(date3ToInstant);
        System.out.println(nowAnd30Days);
        System.out.println(nowAnd3Hour);
        System.out.println(nowMinusHour);
        System.out.println(nowKyivTime);
        System.out.println(now.isBefore(nowMinusHour)); // Compare instants
        System.out.println(now.isAfter(nowMinusHour)); // Compare instants
        System.out.println(now.getNano());
        System.out.println(Instant.now().getNano());

        System.out.println(now.isAfter(nowMinusHour) && now.isBefore(nowAnd3Hour));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formatNow = dateTimeFormatter.format(nowKyivTime); // we cannot use Instant here
        System.out.println(formatNow);

        Instant instant = LocalDateTime.parse(                   // Parse as an indeterminate `LocalDate`, devoid of time zone or offset-from-UTC. NOT a moment, NOT a point on the timeline.
                        "04:30 PM, Sat 5/12/2018",        // This input uses a poor choice of format. Whenever possible, use standard ISO 8601 formats when exchanging date-time values as text. Conveniently, the java.time classes use the standard formats by default when parsing/generating strings.
                        DateTimeFormatter.ofPattern("hh:mm a, EEE M/d/uuuu", Locale.US)  // Use single-character `M` & `d` when the number lacks a leading padded zero for single-digit values.
                )                                      // Returns a `LocalDateTime` object.
                .atZone(                               // Apply a zone to that unzoned `LocalDateTime`, giving it meaning, determining a point on the timeline.
                        ZoneId.of("+2")         // Always specify a proper time zone with `Contintent/Region` format, never a 3-4 letter pseudo-zone such as `PST`, `CST`, or `IST`.
                )                                      // Returns a `ZonedDateTime`. `toString` → 2018-05-12T16:30-04:00[America/Toronto].
                .toInstant();// Extract a `Instant` object, always in UTC by definition.
        System.out.println(instant);




    }
}
