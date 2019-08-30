package cn.wlcloudy.java.core.pattern.singleton;

/**
 * @author: X.Tony
 */
public class ExectorThread implements Runnable{
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazySimpleSingleton);
    }
}
