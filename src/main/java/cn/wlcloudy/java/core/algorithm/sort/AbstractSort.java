package cn.wlcloudy.java.core.algorithm.sort;

import java.util.Arrays;

/**
 * @author: X.Tony
 */
public abstract class AbstractSort {

    protected int[] a;

    /**
     * 排序前
     */
    public void preSort(){
        System.out.println(Arrays.toString(a));
    }

    /**
     * 排序后
     */
    public void backSort(){
        System.out.println(Arrays.toString(a));
    }

    /**
     * 排序算法
     */
    public void sort(){

    }

    /**
     * 验证执行
     */
    public void execute(){
        preSort();
        sort();
        backSort();
    }

    public AbstractSort(int[] a) {
        this.a = a;
    }
}
