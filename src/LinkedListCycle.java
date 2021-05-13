import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4); head.next.next.next = head.next;

        System.out.println(head);
        System.out.println(head.val + "," + head.next);
        System.out.println(head.next.val + "," + head.next.next);
        System.out.println(head.next.next.val + "," + head.next.next.next);
        System.out.println(head.next.next.next.val + "," + head.next.next.next.next);

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

        //traverse Node links til find cycle
        List<ListNode> list = new ArrayList<ListNode>();
        while(true) {
            list.add(cur);
            if(list.contains(cur.next)) {
                hasCycle = true;
                break;
            } else {
                cur = cur.next;
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