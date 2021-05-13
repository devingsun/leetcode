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

//        myLinkedList.addAtHead(7);
//        myLinkedList.addAtHead(2);
//        myLinkedList.addAtHead(1);
//        myLinkedList.addAtIndex(3, 0);    // linked list becomes 1->2->3
//        myLinkedList.deleteAtIndex(2);    // now the linked list is 1->3
//        myLinkedList.addAtHead(6);
//        myLinkedList.addAtTail(4);
//        System.out.println(myLinkedList.get(4));              // return 2
//        myLinkedList.addAtHead(4);
//        myLinkedList.addAtIndex(5, 0);    // linked list becomes 1->2->3
//        myLinkedList.addAtHead(6);

//        myLinkedList.addAtIndex(0, 10);    // linked list becomes 1->2->3
//        myLinkedList.addAtIndex(0, 20);    // linked list becomes 1->2->3
//        myLinkedList.addAtIndex(1, 30);    // linked list becomes 1->2->3
//        System.out.println(myLinkedList.get(0));              // return 2

//        myLinkedList.addAtHead(2);
//        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
//        myLinkedList.addAtHead(2);
//        myLinkedList.addAtHead(7);
//        myLinkedList.addAtHead(3);
//        myLinkedList.addAtHead(2);
//        myLinkedList.addAtHead(5);
//        myLinkedList.addAtTail(5);
//        System.out.println(myLinkedList.get(5));              // return 2
//        myLinkedList.deleteAtIndex(6);    // now the linked list is 1->3
//        myLinkedList.deleteAtIndex(4);    // now the linked list is 1->3
//
//        myLinkedList.addAtHead(4);
//        System.out.println(myLinkedList.get(1));              // return 2
//        myLinkedList.addAtHead(1);
//        myLinkedList.addAtHead(5);
//        myLinkedList.deleteAtIndex(3);    // now the linked list is 1->3
//        myLinkedList.addAtHead(7);
//        System.out.println(myLinkedList.get(3));              // return 2
//        System.out.println(myLinkedList.get(3));              // return 2
//        System.out.println(myLinkedList.get(3));              // return 2
//        myLinkedList.addAtHead(1);
//        myLinkedList.deleteAtIndex(4);    // now the linked list is 1->3

        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        System.out.println(myLinkedList.get(1));              // return 2
        myLinkedList.deleteAtIndex(1);
        System.out.println(myLinkedList.get(1));              // return 2

    }
}
