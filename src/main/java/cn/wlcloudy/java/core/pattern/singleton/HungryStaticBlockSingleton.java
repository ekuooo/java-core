package cn.wlcloudy.java.core.pattern.singleton;

/**
 * @author: X.Tony
 */
public class HungryStaticBlockSingleton {

    private static final HungryStaticBlockSingleton hungrysingleton;

    static {
        hungrysingleton = new HungryStaticBlockSingleton();
    }

    public static HungryStaticBlockSingleton getInstance() {
        return hungrysingleton;
    }
}
