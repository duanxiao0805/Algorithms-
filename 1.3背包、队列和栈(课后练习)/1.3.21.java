package Main;

/*
 *编写一个方法find(),接受一条链表和一个字符串key作为参数.
 *如果链表中的某个结点的item域的值为key,则方法返回true,否则返回false 
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
        boolean res1 = find(first, "b");
        boolean res2 = find(first, "d");
        System.out.println(res1);
        System.out.println(res2);
    }

    static boolean find(Node head, String key) {
        while (head != null) {
            if (head.data.equals(key))
                return true;
            head = head.next;
        }
        return false;
    }
}
