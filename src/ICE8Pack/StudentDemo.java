package ICE8Pack;

public class StudentDemo {
    public static void main(String[] arg) {
        String str;  // Use for output
        StudentArrayStack st = new StudentArrayStack(5);
        str = "\nPushing Student's name, major and hobby onto the stack: \n" +
                "Fred Computer Science Basketball " +
                "Ted Pottery Walking " +
                "Lousa Welding Music ";

        System.out.println(str);
        st.push("Fred", "Computer Science", "Basketball");
        st.push("Ted", "Pottery", "Walking");
        st.push("Louisa", "Welding", "Music");
        str = "\nValue at top of the stack is ";
        System.out.println(str + st.peek());
        str = "\nPopping and printing all values:";
        System.out.println(str);
        while (!st.empty())
            System.out.print(st.pop() + " ");
        System.out.println("\n");
    }

}
