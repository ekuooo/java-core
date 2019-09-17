package cn.wlcloudy.java.core.algorithm.linked;

/**
 * @author: X.Tony
 */
public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        // 插入对头 o(1)
//        linkedList.add(new SinglyLinkedList.Node("1"));
//        linkedList.add(new SinglyLinkedList.Node("2"));
//        linkedList.add(new SinglyLinkedList.Node("3"));
//        linkedList.add(new SinglyLinkedList.Node("4"));
        // 插入队尾 o(n)
        linkedList.addLinked(new SinglyLinkedList.Node("1"));
        linkedList.addLinked(new SinglyLinkedList.Node("2"));
        linkedList.addLinked(new SinglyLinkedList.Node("3"));
        linkedList.addLinked(new SinglyLinkedList.Node("4"));

        SinglyLinkedList.Node node = linkedList.getTable().iterator();
        while(SinglyLinkedList.hasNext(node)){
            System.out.println(node.getData());
            node = node.next();
        }
    }
}
