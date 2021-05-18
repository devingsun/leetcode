import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
//        head.next.next.next.next = head.next;//
        System.out.println(head);
        System.out.println(head.val + "," + head.next);
        System.out.println(head.next.val + "," + head.next.next);
        System.out.println(head.next.next.val + "," + head.next.next.next);
        System.out.println(head.next.next.next.val + "," + head.next.next.next.next);

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
////        head.next.next = head;
//        System.out.println(head);
//        System.out.println(head.val + "," + head.next);

        LinkedListCycle cycle = new LinkedListCycle();
        System.out.println("hasCycle : " + cycle.hasCycle(head));
    }

    public boolean hasCycle(ListNode head) {
        boolean hasCycle = false;

        if(head == null) {
            return false;
        }

        ListNode cur;
        cur = head;
        if (cur.next == null) {
            return false;
        }

        ListNode fastPointer = cur;
        ListNode slowPointer = cur;
        while(fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(fastPointer == slowPointer) {
                hasCycle = true;
                break;
            }
        }

        return hasCycle;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}