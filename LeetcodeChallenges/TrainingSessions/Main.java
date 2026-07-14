abstract class animal{
    abstract void speak();
}
class dog extends animal{
    public void speak(){
        System.out.println("Bark");
    }
}
class cat extends animal{
    public void speak(){
        System.out.println("Meeeooowwww");
    }
}
public class Main {
    public static void main(String[] args){
        dog d = new dog();
        d.speak();
        cat c = new cat();
        c.speak();

    }

    
}
