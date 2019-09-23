package cn.wlcloudy.java.core.algorithm.sort;

/**
 * 选择排序
 * @author: X.Tony
 */
public class SelectionSort extends AbstractSort{

    public SelectionSort(int[] a) {
        super(a);
    }

    @Override
    public void sort() {
        int n = a.length;
        for(int i = 0; i < n; ++i){
            for(int j = i+1; j< n; ++j){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
