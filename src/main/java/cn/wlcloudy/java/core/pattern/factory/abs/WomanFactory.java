package cn.wlcloudy.java.core.pattern.factory.abs;

/**
 * @author: X.Tony
 */
public class WomanFactory implements IPersonFactory {
    public IDream sayDream() {
        return new WomanDream();
    }

    public IFace saveFace() {
        return new WomanFace();
    }
}
