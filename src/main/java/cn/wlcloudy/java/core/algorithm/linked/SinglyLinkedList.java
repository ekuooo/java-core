package cn.wlcloudy.java.core.algorithm.linked;

/**
 * @author: X.Tony
 */
public class SinglyLinkedList {

    private Node table;

    public static class Node {

        private Object data;

        private Node next;

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node() {
        }

        public Node(Object data) {
            this.data = data;
        }

        public Node iterator(){
            return this;
        }

        public Node next (){
            return this.next;
        }
    }

    public SinglyLinkedList() {
    }

    public Node getTable() {
        return table;
    }

    public void setTable(Node table) {
        this.table = table;
    }

    public void add(Node node){
        if(null == this.table){
            this.table = node;
        }else {
            // 如果不是空链表，则则插入
            node.next = this.table.next;
            this.table.next = node;
        }
    }

    public void addLinked(Node node){
        if(null == this.table){
            this.table = node;
        }else {
            Node node1 = this.table;
            while (hasNext(node1)){
                if(null == node1.next){
                    node1.next = node;
                    break;
                }
                node1 = node1.next;
            }
        }
    }

    public static boolean hasNext (Node node){
        if(null == node){
            return false;
        }
        return true;
    }

}
