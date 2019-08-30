package cn.wlcloudy.java.core.pattern.factory.method;

import cn.wlcloudy.java.core.pattern.factory.simple.Person;
import cn.wlcloudy.java.core.pattern.factory.simple.PersonSimpleFactory;

import java.util.Calendar;

/**
 *
 * 工厂方法模式(Fatory Method Pattern)是指定义一个
 * 创建对象的接口，但让实现这个 接口的类来决定实例化哪
 * 个类，工厂方法让类的实例化推迟到子类中进行。
 *
 * @author: X.Tony
 */
public class MethodFactoryTest {

    public static void main(String[] args) {
        IPersonFactory personFactory1 = new ManFactory();
        Person person1 = personFactory1.getInstance();
        person1.sleep();

        IPersonFactory personFactory2 = new WomanFactory();
        Person person2 = personFactory2.getInstance();
        person2.sleep();
    }
}
