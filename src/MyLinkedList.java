public class MyLinkedList {
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index >= size) {
            System.out.println("index : " + index + " is invalid.");
            return -1;
        } else {
            Node cur;
            cur = head;
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            return cur.val;
        }
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            if (tail == null) {
                tail = head;
            }
        } else {
            Node cur = head;
            cur.prev = node;
            node.next = cur;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            addAtHead(val);
        } else {
            Node last = tail;
            newNode.prev = last;
            tail = newNode;

            if (last == null) {
                head = newNode;
            } else {
                last.next = newNode;
            }

            size++;
        }
    }

    public void addAtIndex(int index, int val) {
        Node node = new Node(val);
        if (index == 0) {
            addAtHead(val);
        } else if (size == index) {
            addAtTail(val);
        } else {
            Node cur;
            cur = head;
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            Node before = cur.prev;
            before.next = node;
            node.prev = before;
            node.next = cur;
            cur.prev = node;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        Node atIndex;
        atIndex = head;
        while (index > 0) {
            atIndex = atIndex.next;
            index--;
        }
        if (atIndex == head) {
            if (head == tail) {
                atIndex = null;
            } else {
                Node afterIndex = atIndex.next;
                afterIndex.prev = null;
                head = afterIndex;
                atIndex.next = null;
                atIndex = null;
            }
        } else if (atIndex == tail) {
            Node beforeIndex = atIndex.prev;
            beforeIndex.next = null;
            atIndex.prev = null;
            atIndex = null;
            tail = beforeIndex;
        } else {
            Node beforeIndex = atIndex.prev;
            Node afterIndex = atIndex.next;
            beforeIndex.next = afterIndex;
            afterIndex.prev = beforeIndex;
            atIndex = null;
        }
        size--;
    }
}

class Node {
    int val;
    Node prev;
    Node next;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
