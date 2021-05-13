public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

//        myLinkedList.addAtHead(1);
//        myLinkedList.addAtTail(3);
//        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
//        System.out.println(myLinkedList.get(1));              // return 2
//        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
//        System.out.println(myLinkedList.get(1));              // return 2

//        myLinkedList.addAtHead(1);
//        myLinkedList.deleteAtIndex(0);    // now the linked list is 1->3

        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtIndex(3, 0);    // linked list becomes 1->2->3
        myLinkedList.deleteAtIndex(2);    // now the linked list is 1->3
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);
        System.out.println(myLinkedList.get(4));              // return 2
        myLinkedList.addAtHead(4);
        myLinkedList.addAtIndex(5, 0);    // linked list becomes 1->2->3
        myLinkedList.addAtHead(6);


    }
}
