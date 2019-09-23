package cn.wlcloudy.java.core.algorithm.sort;

/**
 * 希尔排序
 * @author: X.Tony
 */
public class SheelSort extends AbstractSort{

    public SheelSort(int[] a) {
        super(a);
    }

    @Override
    public void sort() {
        int len = a.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = a[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && a[preIndex] > temp) {
                    a[preIndex + gap] = a[preIndex];
                    preIndex -= gap;
                }
                a[preIndex + gap] = temp;
            }
            gap /= 2;
        }
    }
}
