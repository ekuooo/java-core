package cn.wlcloudy.java.core.algorithm.sort;

/**
 * 冒泡排序
 * @author: X.Tony
 */
public class BubbleSort extends AbstractSort{

    public BubbleSort(int[] a) {
        super(a);
    }

    @Override
    public void sort() {
        int n = a.length;
        if(n <= 1) return;
        for (int i = 0; i < n ; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] > a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

}
