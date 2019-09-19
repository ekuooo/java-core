package cn.wlcloudy.java.core.eight.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda表达式
 * @author: X.Tony
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        // 以前的写法
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        // Lambda表达式推荐写法1
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        // Lambda表达式推荐写法2
        Collections.sort(names, (String a, String b) ->  b.compareTo(a));

        // Lambda表达式推荐写法3
        names.sort((a, b) ->  b.compareTo(a));


        // 在 Lambda 表达式中，我们可以访问外部的 final 类型变量，如下面的示例代码：
//        final int num = 1;
        // 与匿名内部类不同的是，我们不必显式声明 num 变量为 final 类型，下面这段代码同样有效：
        int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);
        stringConverter.convert(2);     // 3



    }
}
