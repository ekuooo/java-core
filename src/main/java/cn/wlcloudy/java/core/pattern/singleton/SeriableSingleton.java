package cn.wlcloudy.java.core.pattern.singleton;

import java.io.Serializable;

/**
 * @author: X.Tony
 */
public class SeriableSingleton implements Serializable {
    public static final SeriableSingleton INSTANCE = new SeriableSingleton();

    public SeriableSingleton() {
    }

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    /**
     * 防止序列化破坏单例
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }
}
