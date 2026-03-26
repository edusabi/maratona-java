package me.eduardo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class zoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime1 = now.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

         ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
         OffsetDateTime offsetDateTime = now.atOffset(zoneOffsetManaus);
         System.out.println(offsetDateTime);

         OffsetDateTime offsetDateTime1 = offsetDateTime.of(now, zoneOffsetManaus);
        System.out.println(offsetDateTime1);

         OffsetDateTime offsetDateTime2 = nowInstant.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime2);

         JapaneseDate fromJapan = JapaneseDate.from(LocalDate.now());
        System.out.println(fromJapan);

    }
}
