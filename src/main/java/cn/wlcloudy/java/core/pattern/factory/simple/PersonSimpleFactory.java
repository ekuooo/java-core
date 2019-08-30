package cn.wlcloudy.java.core.pattern.factory.simple;

/**
 *
 * @author: X.Tony
 */
public class PersonSimpleFactory {

    /**
     * 类型比较方式
     * @param type
     * @return
     */
    public static Person getInstanceByType(String type){
        if (type.equalsIgnoreCase("man"))
            return new Man();
        if (type.equalsIgnoreCase("woman"))
            return new Woman();
        return null;
    }

    /**
     * 反射方式
     * @param className
     * @return
     */
    public static Person getInstanceByReflect(String className){
        if(null == className || className.equalsIgnoreCase("")){
            return null;
        }
        try {
            Person person = (Person) Class.forName(className).newInstance();
            return person;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
