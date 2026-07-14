//package TrainingSessions;
abstract class Alpha{
    public abstract void a1();
    public void a2(){
        System.out.println("Abstract class method");
    }
}
class Beta extends Alpha{
    public void a1(){
        System.out.println("Abstracting from abstract class");
    }
}

public class abstractclass {
    public static void main(String [] args){
         Beta b1 = new Beta();
         b1.a1();
         b1.a2();
        
        
    }
}
