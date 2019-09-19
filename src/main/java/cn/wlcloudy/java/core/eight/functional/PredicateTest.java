package cn.wlcloudy.java.core.eight.functional;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Predicate 是一个可以指定入参类型，并返回 boolean 值的函数式接口。
 * 它内部提供了一些带有默认实现的方法，可以 被用来组合一个复杂的逻辑
 * 判断（and == &, or == | , negate == ！）：
 * @author: X.Tony
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;
        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
    }
}
