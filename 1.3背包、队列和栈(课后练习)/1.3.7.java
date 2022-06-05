package Main;

import java.util.Iterator;

class Stack<Item> implements Iterable<Item> {

    private Node first;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null || N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop() {
        if (this.isEmpty())
            return null;
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Item peek() {
        if (this.isEmpty())
            return null;
        return first.item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private Node n = first;

            @Override
            public boolean hasNext() {
                return n != null;
            }

            @Override
            public Item next() {
                Item data = n.item;
                n = n.next;
                return data;
            }

        };
    }

}

class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
