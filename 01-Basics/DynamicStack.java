public class DynamicStack {
    private SLL top;

    public DynamicStack() {
        top = new SLL();
    }

    public void push(CallDetails d) {
        top.addFront(d);
    }

    public void Push(CallDetails d) {
        push(d);
    }

    public CallDetails pop() {
        if (top.isEmpty()) {
            return null;
        }
        return top.deletefront();
    }

    public void display() {
    top.display();
}
}
