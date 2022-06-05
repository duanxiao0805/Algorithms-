package Main;

import java.util.Stack;

/*
 * 当N为50时下面这段代码会打印什么?从较高的抽象层次描述给定正整数N时这段代码的行为

 */
class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int N = 50;
        while (N > 0) {
            st.push(N % 2);
            N = N / 2;
        }
        for (int d : st)
            System.out.println(d);
    }
}
// out:110010 这个也就是转换成二进制的50
