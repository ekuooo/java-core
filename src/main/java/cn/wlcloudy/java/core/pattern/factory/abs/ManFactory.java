package cn.wlcloudy.java.core.pattern.factory.abs;

/**
 * @author: X.Tony
 */
public class ManFactory implements IPersonFactory {
    public IDream sayDream() {
        return new ManDream();
    }

    public IFace saveFace() {
        return new ManFace();
    }
}
