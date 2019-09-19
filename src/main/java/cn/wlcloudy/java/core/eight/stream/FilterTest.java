package cn.wlcloudy.java.core.eight.stream;

/**
 * @author: X.Tony
 */
public class FilterTest extends StramTest{
    public static void main(String[] args) {
        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        // "aaa2", "aaa1"
        // 注意：foreach 是一个终端操作，它的返参是 void, 我们无法对其再次进行流操作。
    }
}
