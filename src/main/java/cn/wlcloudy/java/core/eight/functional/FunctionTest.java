package cn.wlcloudy.java.core.eight.functional;

import java.util.function.Function;

/**
 * @author: X.Tony
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        backToString.apply("123");     // "123"
    }
}
