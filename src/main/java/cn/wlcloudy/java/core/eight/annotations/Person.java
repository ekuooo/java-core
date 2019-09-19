package cn.wlcloudy.java.core.eight.annotations;

/**
 * Java 8 中，通过 @Repeatable，允许我们对同一个类使用多重注解：
 * @author: X.Tony
 */
@Hint("hint1")
@Hint("hint2")
//@Hints({@Hint("hint1"), @Hint("hint2")})
public class Person {
}
