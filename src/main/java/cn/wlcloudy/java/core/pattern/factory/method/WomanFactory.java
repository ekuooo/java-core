package cn.wlcloudy.java.core.pattern.factory.method;

import cn.wlcloudy.java.core.pattern.factory.simple.Person;
import cn.wlcloudy.java.core.pattern.factory.simple.Woman;

/**

 *
 * @author: X.Tony
 */
public class WomanFactory implements IPersonFactory{
    public Person getInstance() {
        return new Woman();
    }
}
