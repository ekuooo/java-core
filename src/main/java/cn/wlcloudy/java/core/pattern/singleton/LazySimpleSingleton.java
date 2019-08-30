package cn.wlcloudy.java.core.pattern.singleton;

/**
 * @author: X.Tony
 */
public class LazySimpleSingleton {

    public LazySimpleSingleton() {
    }

    public static LazySimpleSingleton lazy = null;

    public static LazySimpleSingleton getInstance(){
        if(lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
