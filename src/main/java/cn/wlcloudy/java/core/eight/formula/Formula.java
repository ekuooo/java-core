package cn.wlcloudy.java.core.eight.formula;

/**
 * 接口内允许添加默认实现的方法
 * @author: X.Tony
 */
public interface Formula {
    // 计算
    double calculate(int a);

    // 求平方根
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
