package Main;

class Main {
    public static void main(String[] args) {
        MaxPQ<String> p = new MaxPQ(100);
        p.insert("P");
        p.insert("R");
        p.insert("I");
        p.insert("O");
        System.out.println(p.delMax());
        p.insert("R");
        p.delMax();
        p.delMax();
        p.insert("I");
        p.delMax();
        p.insert("T");
        p.delMax();
        p.insert("Y");
        p.delMax();
        p.delMax();
        p.delMax();
        p.insert("Q");
        p.insert("U");
        p.insert("E");

    }
}

class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;

    public MaxPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insert(Key v) {
        pq[++N] = v;
        swim(N);
    }

    public Key delMax() {
        Key max = pq[1]; // 从根结点得到最大元素
        exch(1, N--); // 将其和最后一个结点交换
        pq[N + 1] = null; // 防止对象流离
        sink(1); // 恢复堆的有序性
        return max;
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i, int j) {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    // 上浮
    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k, k / 2);
            k = k / 2;
        }
    }

    // 下沉
    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1))
                j++;
            if (!less(k, j))
                break;
            exch(k, j);
            k = j;
        }
    }

}
