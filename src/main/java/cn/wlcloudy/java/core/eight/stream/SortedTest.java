package cn.wlcloudy.java.core.eight.stream;

/**
 * @author: X.Tony
 */
public class SortedTest extends StramTest{
    public static void main(String[] args) {
        System.out.println(stringCollection);

        stringCollection
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        // "aaa1", "aaa2"
        // 需要注意，sorted 不会对 stringCollection 做出任何改变，stringCollection 还是原有的那些个元素，且顺序不变：

        System.out.println(stringCollection);
        // ddd2, aaa2, bbb1, aaa1, bbb3, ccc, bbb2, ddd1
    }
}
