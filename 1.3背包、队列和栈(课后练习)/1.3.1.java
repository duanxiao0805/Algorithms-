package Main;
/*
 * 为FixedCapacityStackOfStrings添加一个方法:Isfull()
 */
class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;

    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

    // 添加IsFull()方法
    public boolean Isfull() {
        return N == a.length;
    }
}
