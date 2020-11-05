package _9_arraylist_and_linkedlist.bai_tap;

public class TestMylinkedList {
    public static void main(String[] args) {
        System.out.println("=======TESTING=======");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(3);
        myLinkedList.addLast(5);
        myLinkedList.addLast(8);
        myLinkedList.add(3, 9);
        myLinkedList.getFirst();
        myLinkedList.getLast();
       // myLinkedList.printList();
    }
}
