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
            return getNode(index).val;
        }
    }

    public Node getNode(int index) {
        //traverse fowrard
        Node cur = null;
        int offset = 0;

        if (index < size / 2) {
            cur = head;
            offset = index;
            while (offset > 0) {
                cur = cur.next;
                offset--;
            }
        } else {
            //traverse backward
            cur = tail;
            offset = size - 1 - index;
            while(offset > 0) {
                cur = cur.prev;
                offset--;
            }
        }
        return cur;
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
            Node cur = getNode(index);

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
        Node cur;
        cur = getNode(index);

        if (cur == head) {
            if (head == tail) {
                cur = null;
            } else {
                Node afterIndex = cur.next;
                afterIndex.prev = null;
                head = afterIndex;
                cur.next = null;
                cur = null;
            }
        } else if (cur == tail) {
            Node beforeIndex = cur.prev;
            beforeIndex.next = null;
            cur.prev = null;
            cur = null;
            tail = beforeIndex;
        } else {
            Node beforeIndex = cur.prev;
            Node afterIndex = cur.next;
            beforeIndex.next = afterIndex;
            afterIndex.prev = beforeIndex;
            cur = null;
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
