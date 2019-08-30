package cn.wlcloudy.java.core.pattern.factory.method;

import cn.wlcloudy.java.core.pattern.factory.simple.Man;
import cn.wlcloudy.java.core.pattern.factory.simple.Person;

/**

 *
 * @author: X.Tony
 */
public class ManFactory implements IPersonFactory{
    public Person getInstance() {
        return new Man();
    }
}
