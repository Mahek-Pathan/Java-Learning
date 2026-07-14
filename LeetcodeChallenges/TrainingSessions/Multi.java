//package TrainingSessions;
interface X {
    public void y();
    
}
interface Y{
    public void x();
}
class C implements X,Y{
    public void y(){
        System.out.println("A");
    }
    public void x(){
        System.out.println("B");
    }
}
public class Multi {
    public static void main(String[] args){
        C c=  new C();
        c.x();
        c.y();
    }
    
}
