package Main;

/*
 * 给定以下输出,给出DoublingStackOfStrings的数组的内容和大小
 * it was - the best - of times - - - it was - the - -
 */
class Main {
    public static void main(String[] args) {
        ResizingArrayStack<String> st = new ResizingArrayStack<String>();
        String[] s = "it was - the best - of times - - - it was - the - -".split(" ");

        for (int i = 0; i < s.length; i++) {
            if (s[i] == "-")
                st.pop();
            else
                st.push(s[i]);
        }

    }
}
