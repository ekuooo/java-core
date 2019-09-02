package cn.wlcloudy.java.core.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 *
 * @author: X.Tony
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        Class<?> clazz = LazyInnerClassSingleton.class;
        try {
            Constructor c = clazz.getDeclaredConstructor(null);
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1 == o2); // false  反射破坏单例
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
