package cn.wlcloudy.java.core.algorithm.offer;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一
 * 个整数，判断数组中是否含有该整数。
 *
 * @author: X.Tony
 */
public class Q01 {

    public static boolean find(int target, int [][] array) {
        boolean flag = false;
        for(int i = array.length - 1; i >= 0; i--){
            for(int j =0; j< array[i].length; j++){
                if(array[i][j] > target){
                    break;
                }else if(array[i][j] < target){
                    continue;
                }else{
                    flag = true;
                }
            }
        }
        return flag;
    }

}
