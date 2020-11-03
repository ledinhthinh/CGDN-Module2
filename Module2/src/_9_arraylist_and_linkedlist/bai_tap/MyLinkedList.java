package _9_arraylist_and_linkedlist.bai_tap;

import org.junit.platform.engine.support.hierarchical.Node;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        _9_arraylist_and_linkedlist.thuc_hanh.linkedlist_don_gian.MyLinkedList.Node temp = head;
        _9_arraylist_and_linkedlist.thuc_hanh.linkedlist_don_gian.MyLinkedList.Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new _9_arraylist_and_linkedlist.thuc_hanh.linkedlist_don_gian.MyLinkedList.Node(data);
        temp.next.next = holder;
        numNodes++;
    }
}
