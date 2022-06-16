package Main;

/*
 * 编写了一个Queue的用例,接受一个命令行参数k并打印出标准输入中的倒数第k个字符串(假设标准输入中至少有k个字符串)
 */
class Main {

    static void printKthString(String[] s, int k) {
        Queue<String> queue = new Queue<>();
        for (String str : s)
            queue.enqueue(str);
        int size = queue.size();
        for (int i = 0; i < size - k; i++)
            queue.dequeue();
        System.out.println("倒数第" + k + "个字符串是" + queue.dequeue());

    }

    public static void main(String[] args) {
        String[] s = "duanxiao".split("");
        int k = 3;
        printKthString(s, k);
    }
}

// 实现队列
class Queue<Item> {
    private Node first;
    private Node last;
    private int N;

    class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        // 向表尾添加元素
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
            first = last;
        else
            oldlast.next = last;
        N++;
    }

    public Item dequeue() {
        // 从表头删除元素
        Item item = first.item;
        first = first.next;
        if (isEmpty())
            last = null;
        N--;
        return item;
    }

}
