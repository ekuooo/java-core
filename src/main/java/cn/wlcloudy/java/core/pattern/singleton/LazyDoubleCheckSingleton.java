package cn.wlcloudy.java.core.pattern.singleton;

/**
 *
 * @author: X.Tony
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton singleton;

    public static LazyDoubleCheckSingleton getInstance(){
        if (null == singleton){
            synchronized (LazyDoubleCheckSingleton.class){
                if(null == singleton){
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
