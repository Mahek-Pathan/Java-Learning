class CallDetails {
    int no;
    String name;
    public CallDetails(){

    }
    public CallDetails(int n, String s){
        no = n; name=s;

    }
    public String toString(){
        return " "+ no+" "+name;
    }
}
public class Node{
    CallDetails data;
    Node next;
    public Node(){
        data = new CallDetails();
        next=null;

    }
    public Node(CallDetails d){
        data = d;
        next = null;
    }
    public String toString(){
        return data.toString();
    }
}