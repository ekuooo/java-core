package cn.wlcloudy.java.core.eight.functional;

import java.util.Optional;

/**
 * @author: X.Tony
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }
}
