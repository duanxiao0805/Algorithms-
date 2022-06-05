package Main;

import java.util.Stack;

/*
 * 给定一下输入,java Stack的输出是什么?
 * it was - the best - of times - - - it was - the - -
 */
class Main {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        for (String s : "it was - the best - of times - - - it was - the - -".split(" ")) {
            if (s.equals("-"))
                System.out.print(st.pop() + " ");
            else
                st.push(s);
        }
        // out:was best times of the was the it
    }
}
