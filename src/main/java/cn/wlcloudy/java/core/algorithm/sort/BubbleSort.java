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
        for (int i = 0; i < n ; ++i){
            boolean flag = false;
            for(int j=0; j<n-i-1; ++j){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }

}
