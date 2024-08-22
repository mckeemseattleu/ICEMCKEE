package ICE8Pack;

public class StudentArrayStack {
    private String [] s;  // Holds stack elements
    private int top;   // Stack top pointer
    private String name;
    private String major;
    private String hobby;

    /**
     * Constructor.
     *
     * @param capacity The capacity of the stack.
     */

    public StudentArrayStack(int capacity) {
        s = new String [capacity];
        top = 0;
    }

    public StudentArrayStack(String nm, String maj, String hob) {
        this.name = nm;
        this.major = maj;
        this.hobby = hob;
    }

    /**
     * The empty method checks for an empty stack.
     *
     * @return true if stack is empty.
     */

    public boolean empty() {
        return top == 0;
    }

    /**
     * The push method pushes a value onto the stack.
     *
     * @param x The value to push onto the stack.
     * @throws StackOverflowException When the
     *                                stack is full.
     */

    public void push(String n, String m, String h) {
        if (top == s.length)
            throw new StackOverFlowException();
        else {
            s[top] = n + " " + m + " " + h;
            top++;
        }
    }

    /**
     * The pop method pops a value off the stack.
     *
     * @return The value popped.
     * @throws EmptyStackException When the
     *                             stack is empty.
     */

    public String  pop() {
        if (empty())
            throw new EmptyStackException();
        else {
            top--;
            return s[top];
        }
    }

    /**
     * The peek method returns the value at the
     * top of the stack.
     *
     * @return value at top of the stack.
     * @throws EmptyStackException When the
     *                             stack is empty.
     */

    String peek() {
        if (empty())
            throw new EmptyStackException();
        else {
            return s[top - 1];
        }
    }

    public class StackOverFlowException extends RuntimeException {
    }

    public class EmptyStackException extends RuntimeException {
    }
}
