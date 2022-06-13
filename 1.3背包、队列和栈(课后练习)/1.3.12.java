class Main {
    public static void main(String[] args) {
        ResizingArrayStack<String> stack = new ResizingArrayStack<String>();
        stack.push("duan");
        stack.push("xiao");
        ResizingArrayStack<String> copy = copy(stack);
        for (String s : copy)
            System.out.println(s);
    }

    public static ResizingArrayStack<String> copy(ResizingArrayStack<String> stack) {
        ResizingArrayStack<String> temp = new ResizingArrayStack<String>();
        ResizingArrayStack<String> copy = new ResizingArrayStack<String>();

        // copy from stack to temp
        for (String s : stack)
            temp.push(s);
        for (String s : temp)
            copy.push(s);

        return copy;
    }
}
