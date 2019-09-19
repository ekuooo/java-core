package cn.wlcloudy.java.core.eight.functional;

/**
 * @author: X.Tony
 */
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
