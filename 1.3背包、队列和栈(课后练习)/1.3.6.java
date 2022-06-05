package Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 下面这段代码对队列q进行了什么操作?
 */
class Main {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Queue<String> q = new LinkedList<>();
        q.add("a");
        q.add("b");
        q.add("c");

        while (!q.isEmpty()) {
            st.push(q.poll());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
// out:c b a 逆序队列
