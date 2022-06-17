package Main;

/*
 * 给出一段代码,删除链表的尾结点,其中链表的首结点为first
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
        Node head = delLast(first);
    }

    static Node delLast(Node head) {
        Node temp = head;
        Node next = temp.next;

        while (next.next != null) {
            temp = temp.next;
            next = next.next;
        }
        temp.next = null;
        return head;
    }

}
