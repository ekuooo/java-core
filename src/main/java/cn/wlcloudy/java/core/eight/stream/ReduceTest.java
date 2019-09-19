package cn.wlcloudy.java.core.eight.stream;

import java.util.Optional;

/**
 * @author: X.Tony
 */
public class ReduceTest extends StramTest{
    public static void main(String[] args) {
        Optional<String> reduced =
                stringCollection
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
        // "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"

    }
}
