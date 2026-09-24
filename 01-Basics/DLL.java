public class DLL {
    DNode head;
    public DLL(){
        head = null;
    }
    public void insert(String data , int pos){
        DNode n1= new DNode(data);
        if(head==null){
            head=n1;
            return;

        }
        if(pos==1){
            n1.next=head;
            head.prev = n1;
            head = n1;
            return;
        }
        //if position is greater than count add at end 
        DNode temp = head;
        for(int i = 1; i<pos-1&&temp.next!=null;i++)
            temp = temp.next;
            // if(temp==null){
                // System.out.println("Not valid postition");
                // return;
            // }
            n1.next= temp.next;
            if(n1.next!=null)
                n1.next.prev=n1;
            n1.prev=temp;
            temp.next=n1;

        }
         public void print(){
             DNode temp =head;
             while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
    }
    public void printFront(){
        DNode temp;
        for(temp=head;temp.next!=null;temp=temp.next);
        while(temp!=null){
            System.out.println(temp.data+ " ");
            temp=temp.prev;
        }
    }
    
}
