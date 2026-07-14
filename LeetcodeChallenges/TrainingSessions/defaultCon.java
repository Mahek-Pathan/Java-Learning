
class A {
    String name="alisha";
    A(String name){
        this.name=name;
    }   
}
class B extends A{
    int age;
    B(String name,int age){
        super(name);
        this.age=age;
    }
    public void a(){
        System.out.println("Name: "+name+"Age"+age);
    }
}
public class defaultCon{
    public static void main(String[] args){
        //A x = new A("Mahek");
        B y = new B("Misba",21);
        y.a();
        
    }
}
