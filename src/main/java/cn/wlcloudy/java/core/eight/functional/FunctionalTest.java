package cn.wlcloudy.java.core.eight.functional;

/**
 * @author: X.Tony
 */
public class FunctionalTest {
    public static void main(String[] args) {
        //注意：上面的示例代码，即使去掉 @FunctionalInterface 也是好使的，它仅仅是一种约束而已。
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123

        //java8新特性写法
        Converter<String, Integer> converter2 = Integer::valueOf;
        Integer converted2 = converter2.convert("123");
        System.out.println(converted2);   // 123
        //Java 8 中允许你通过 :: 关键字来引用类的方法或构造器。
        //上面的代码简单的示例了如何引用静态方法，当然，除了静态方法，我们还可以引用普通方法：

        Something something = new Something();
        Converter<String, String> converter3 = something::startsWith;
        String converted3 = converter3.convert("Java");
        System.out.println(converted3);    // "J"

        //接下来，我们再来看看如何通过 :: 关键字来引用类的构造器。首先，我们先来定义一个示例类，在类中声明两个构造器：
        // 直接引用 Person 构造器
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");


    }
}
