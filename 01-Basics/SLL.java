public class SLL {
    Node head;
    public SLL(){
        head = null;
    }
    public void addFront(CallDetails d){
        Node n1 = new Node(d);
        if(head == null){
            head = n1;
            return;
        }
        n1.next=head;
        head=n1;

    }
    public boolean isEmpty(){
        return head== null;

    }
    public CallDetails deletefront(){
        Node temp = null;
        if(!isEmpty()){
            temp = head;
            head = head.next;
        }
        return temp.data;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
