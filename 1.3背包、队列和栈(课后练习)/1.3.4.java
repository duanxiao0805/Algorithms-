package Main;

import java.util.Stack;

/*
 * 编写一个Stack的用例Parentheses
 * 从标准输入中读取一个文本流并使用栈判定其中的括号是否匹配完整
 * 例如,对于[()]{}{[()()]()}程序应该打印true
 */
class Main {
    public static void main(String[] args) {
        String s = "[()]{}{[()()]()}";
        System.out.println(isParenthesesPairing(s));
    }

    public static boolean isParenthesesPairing(String s) {
        Stack<String> st = new Stack<>();
        String[] s1 = s.split("");
        for (String ss : s1) {
            if (st.empty())
                st.push(ss);
            else if ((st.peek().equals("(") && ss.equals(")")) || (st.peek().equals("[") && ss.equals("]"))
                    || (st.peek().equals("{") && ss.equals("}")))
                st.pop();

        }
        if (st.empty())
            return true;
        return false;
    }
}
