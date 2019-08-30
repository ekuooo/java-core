package cn.wlcloudy.java.core.pattern.factory.simple;

import java.util.Calendar;

/**
 *
 * 简单工厂模式(Simple Factory Pattern)是指由一个
 * 工厂对象决定创建出哪一种产品类 的实例，但它不属于 GOF，23 种设计模式
 * @author: X.Tony
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Person person1 = PersonSimpleFactory.getInstanceByType("man");
        person1.sleep();

        Person person2 = PersonSimpleFactory.getInstanceByReflect("cn.wlcloudy.java.core.pattern.factory.simple.Woman");
        person2.sleep();

        // Calendar JDK简单工厂模式栗子
        Calendar calendar = Calendar.getInstance();
    }
}
