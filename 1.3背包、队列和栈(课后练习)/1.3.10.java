package Main;

import java.util.Stack;

/*
 * 编写一个过滤器InfixToPostfix,将算术表达式由中序表达式转为后序表达式
 */
class Main {
    public static void main(String[] args) {
        String str = "((1+2)*((3-4)*(5-6)))";
        Stack<String> vals = new Stack<>();
        Stack<String> ops = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (check(c))
                ops.push(c + "");
            else if (c == ')') {
                String v = vals.pop();
                String w = vals.pop();
                String String = w + " " + v + " " + ops.pop();
                vals.push(String);
            } else if (c == '(') {

            } else
                vals.push(c + "");
        }
        System.out.println(vals.pop());
    }

    // 判断是否为操作符
    public static boolean check(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
