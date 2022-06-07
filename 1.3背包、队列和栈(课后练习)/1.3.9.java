package Main;

import java.util.Stack;

/*
 * 编写一段程序,从标准输入得到一个缺少左括号的表达式并打印出补全括号之后的中序表达式
 * 1+2)*3-4)*5-6)))
 * ((1+2)*((3-4)*(5-6)))
 */
class Main {
    public static void main(String[] args) {
        String s = "1+2)*3-4)*5-6)))";
        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();

        String[] ss = s.split("");
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].equals("+") || ss[i].equals("-") || ss[i].equals("*") || ss[i].equals("/")) {
                ops.push(ss[i]);
            } else if (ss[i].equals(")")) {
                String str = "(";
                String a = vals.pop();
                String b = vals.pop();
                String c = ops.pop();
                str = str + b + c + a + ")";
                vals.push(str);
            } else
                vals.push(ss[i]);
        }
        while (!vals.isEmpty()) {
            System.out.print(vals.pop());
        }
    }
}
