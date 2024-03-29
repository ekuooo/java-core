package cn.wlcloudy.java.core.eight.functional;

import java.util.function.Consumer;

/**
 * @author: X.Tony
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
        greeter.accept(new Person("Luke", "Skywalker"));
    }
}
