package cn.wlcloudy.java.core.eight.stream;

/**
 * @author: X.Tony
 */
public class CountTest extends StramTest{
    public static void main(String[] args) {
        // 先对 list 中字符串开头为 b 进行过滤，让后统计数量
        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();

        System.out.println(startsWithB);    // 3
    }
}
