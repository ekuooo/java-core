package cn.wlcloudy.java.core.eight.lambda;

/**
 * 只要接口中仅仅包含一个抽象方法，我们就可以将其改写为 Lambda 表达式。
 * 为了保证一个接口明确的被定义为一个函数式接口（Functional Interface），
 * 我们需要为该接口添加注解：@FunctionalInterface。这样，一旦你添加了第二个抽象方法，
 * 编译器会立刻抛出错误提示。
 * @author: X.Tony
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F romm);
}
