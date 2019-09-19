package cn.wlcloudy.java.core.eight.formula;

/**
 * @author: X.Tony
 */
public class FormulaTest {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        formula.calculate(100);     // 100.0
        formula.sqrt(16);           // 4.0

        //带有默认实现的接口方法，是不能在 lambda 表达式中访问的，上面这段代码将无法被编译通过。
//        Formula formula = (a) -> sqrt(a * 100);
    }
}
