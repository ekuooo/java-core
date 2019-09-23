package cn.wlcloudy.java.core.algorithm.sort;

import java.util.Arrays;

/**
 * @author: X.Tony
 */
public class SortTest {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 1, 3, 2};
//        BubbleSort bubbleSort = new BubbleSort(a);
//        bubbleSort.execute();

//        OptimizeBubbleSort optimizeBubbleSort = new OptimizeBubbleSort(a);
//        optimizeBubbleSort.execute();

//        InsertionSort insertionSort = new InsertionSort(a);
//        insertionSort.execute();

//        OptimizeInsertionSort optimizeInsertionSort = new OptimizeInsertionSort(a);
//        optimizeInsertionSort.execute();

//        SheelSort sheelSort = new SheelSort(a);
//        sheelSort.execute();

//        SelectionSort selectionSort = new SelectionSort(a);
//        selectionSort.execute();


        MergeSort mergeSort = new MergeSort(a);
        mergeSort.execute();
    }
}
