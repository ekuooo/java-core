package cn.wlcloudy.java.core.algorithm;

/**
 * @author: X.Tony
 */
public class Test {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public static void climbStairs(int n) {
        // 全1
        for (int k=0; k<n; k++){
            System.out.print("1 ");
        }
        for(int k=n-1; k>=0 ; k--){
            if((n - k)%2 == 0){
                int i = k;
                int j = (n - k)/2;
                print(i, j);
            }
        }
    }

    public static void print(int i, int j){
        for (int k=i; k>0; k--){
            System.out.print("1 ");
        }

        for (int k=j; k>0; k--){
            System.out.print("2 ");
        }

        System.out.println("saasda");
    }

    public static void main(String[] args) {
        climbStairs(3);
    }
}
