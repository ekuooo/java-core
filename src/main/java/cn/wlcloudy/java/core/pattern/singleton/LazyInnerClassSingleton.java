package cn.wlcloudy.java.core.pattern.singleton;

/**
 * @author: X.Tony
 */
public class LazyInnerClassSingleton {

    public LazyInnerClassSingleton() {
        // 防止反射机制破坏单例
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    public static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
