package cn.wlcloudy.java.core.pattern.singleton;

/**
 * @author: X.Tony
 */
public class HungrySimpleSingleton {

    private static final HungrySimpleSingleton hungrysingleton = new HungrySimpleSingleton();

    public HungrySimpleSingleton() {
    }

    public static HungrySimpleSingleton getInstance(){
        return hungrysingleton;
    }
}
