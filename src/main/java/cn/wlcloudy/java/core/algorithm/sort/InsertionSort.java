package cn.wlcloudy.java.core.algorithm.sort;

/**
 * 插入排序
 * @author: X.Tony
 */
public class InsertionSort extends AbstractSort{

    public InsertionSort(int[] a) {
        super(a);
    }

    @Override
    public void sort() {
        int n = a.length;
        // 插入排序，a 表示数组，n 表示数组大小
        if (n <= 1) return;

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j+1] = a[j];  // 数据移动
                } else {
                    break;
                }
            }
            a[j+1] = value; // 插入数据
        }
    }

}
