package cn.wlcloudy.java.core.algorithm.offer;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串
 * 为We%20Are%20Happy。
 *
 * @author: X.Tony
 */
public class Q02 {

    /**
     * 方法1
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        if(str.length() ==0){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < str.length()){
            if(str.charAt(i) == ' '){
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    /**
     * 方法2
     * @param str
     * @return
     */
    public String replaceSpace2(StringBuffer str) {
       String newStr = str.toString().replace(" ", "%20");
       return newStr;
    }

}
