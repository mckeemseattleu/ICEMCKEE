package ICE8Pack;

public class StudentLinkedListStack {

    private class Node {
        Student value;
        Node next;
        Node(Student s, StudentLinkedListStack.Node n)
        {
            value = s;
            next = n;
        }
    }
    private Node top = null;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Student s) {
        if (isEmpty()) {
            throw new StackOverflowError();
        } else {
            top = new Node(s, top);
        }
    }

    public Student pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            Student s = top.value;
            top = top.next;
            return s;
        }
    }

    public Student peek() {
        if (isEmpty()) {
            return null;
        } else {
            Student s = top.value;
            return s;
        }
    }

    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        Node p = top;
        while (p != null) {
            sBuilder.append(p.value);
            p = p.next;
            if (p != null)
                sBuilder.append("\n");
        }
        return sBuilder.toString();
    }
}

class EmptyStackException extends RuntimeException {
}
