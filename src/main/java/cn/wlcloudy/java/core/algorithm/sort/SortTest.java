package cn.wlcloudy.java.core.algorithm.sort;

/**
 * @author: X.Tony
 */
public class SortTest {
    public static void main(String[] args) {
        int[] a = {3, 2, 1};
//        BubbleSort bubbleSort = new BubbleSort(a);
//        bubbleSort.execute();

        OptimizeBubbleSort optimizeBubbleSort = new OptimizeBubbleSort(a);
        optimizeBubbleSort.execute();
    }
}
