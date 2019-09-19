package cn.wlcloudy.java.core.eight.functional;

import java.util.function.Supplier;

/**
 * @author: X.Tony
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();   // new Person
    }
}
