package Main;

import java.util.Iterator;

//下压(LIFO)栈,能够动态调整数组大小的实现
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1]; // 栈元素
    private int N = 0; // 元素数量

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void resize(int max) {
        // 将栈移动到一个大小为max的新数组
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }

    public void push(Item item) {
        if (N == a.length)
            resize(a.length * 2);
        a[N] = item;
        N++;
    }

    public Item pop() {
        N--;
        Item item = a[N];
        a[N] = null;
        if (N > 0 && N == a.length / 4)
            resize(a.length / 2);
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        // 支持后进先出的迭代
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

    }

}
