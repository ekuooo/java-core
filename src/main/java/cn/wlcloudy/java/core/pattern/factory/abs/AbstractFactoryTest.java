package cn.wlcloudy.java.core.pattern.factory.abs;

/**
 *
 * 抽象工厂模式(Abastract Factory Pattern)是指提供一个创建一系列相关或相互依赖
 * 对象的接口，无需指定他们具体的类
 * @author: X.Tony
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        IPersonFactory personFactory = new WomanFactory();
        IFace face = personFactory.saveFace();
        face.safe();
    }
}
