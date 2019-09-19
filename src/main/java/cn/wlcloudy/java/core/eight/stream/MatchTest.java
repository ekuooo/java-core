package cn.wlcloudy.java.core.eight.stream;

/**
 * @author: X.Tony
 */
public class MatchTest extends StramTest{
    public static void main(String[] args) {
        // 验证 list 中 string 是否有以 a 开头的, 匹配到第一个，即返回 true
        boolean anyStartsWithA =
                stringCollection
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println(anyStartsWithA);      // true

        // 验证 list 中 string 是否都是以 a 开头的
        boolean allStartsWithA =
                stringCollection
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartsWithA);      // false

        // 验证 list 中 string 是否都不是以 z 开头的,
        boolean noneStartsWithZ =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithZ);      // true

    }
}
