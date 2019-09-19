package cn.wlcloudy.java.core.eight.dateapi;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

/**
 * @author: X.Tony
 */
public class ClockTest {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();

        Instant instant = clock.instant();
        Date legacyDate = Date.from(instant);   // 老版本 java.util.Date
    }
}
