package cn.wlcloudy.java.core.algorithm.offer;

import java.util.ArrayList;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @author: X.Tony
 */
public class Q03 {

    ArrayList<Integer> result = new ArrayList<>();


    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode.next == null){
            result.add(listNode.val);
            return result;
        }
        printListFromTailToHead(listNode.next);
        return result;
    }

}
