package cn.wlcloudy.java.core.eight.stream;

/**
 * @author: X.Tony
 */
public class MapTest extends StramTest{
    public static void main(String[] args) {
        System.out.println(stringCollection);
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        // "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"

        System.out.println(stringCollection);

        // 另外，我们还可以做对象之间的转换，业务中比较常用的是将 DO（数据库对象） 转换成 BO（业务对象） 。

    }
}
