
class Node{
     int data;
     Node left,right;
     public Node(int d){
        data = d;
        left=right=null;
     }
} 
class BST{
    Node root;
    public BST(){
        root=null;
    }
    public void addnode(int d){
        Node n1 = new Node(d);
        if(root==null){
            root = n1;
            System.out.println("Root created");
            return;
        }
        Node temp = root;
        while (true){
            if(n1.data<temp.data){
                if(temp.left == null){
                    System.out.println("Node added at left");
                    temp.left = n1;
                    break;
                }
                else 
                    temp = temp.left;

            }
            else if(n1.data>temp.data){
                if(temp.right==null){
                    System.out.println("Node added at right");
                    temp.right =n1;
                    break;
                }
                else
                    temp = temp.right;
            }
        }
    }
}

public class Tester4 {
    
}
