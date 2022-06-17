package Main;

/*
 * 编写一个方法delete(),接受一个int参数k,删除链表的第k个元素(如果它存在的话)
 */
class Node {
    String data;
    Node next;
}

class Main {
    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        first.data = "a";
        second.data = "b";
        third.data = "c";
        first.next = second;
        second.next = third;
        int k = 1;
        Node head = delete(first, k);
        int n = 1;
    }

    static Node delete(Node head, int k) {
        // k=0的情况下,也就是删除链表的第0的元素
        if (k == 0)
            return head.next;
        Node cur = head;
        while (--k > 0) {
            cur = cur.next;
            if (cur.next == null)
                throw new RuntimeException("list out of bounds");

        }
        cur.next = cur.next.next;
        return head;
    }
}
