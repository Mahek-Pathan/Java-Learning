
public class Tester {
    public static void main(String[] args) {
        //callDetails obj = new CallDetails();
        DynamicStack s1 = new DynamicStack();
        s1.push(new CallDetails(1122,"Trupti"));
        s1.push(new CallDetails(5588,"dipti"));
        s1.push(new CallDetails(33455,"srushti"));
        s1.push(new CallDetails(4345,"kirti"));
        s1.push(new CallDetails(4334,"mukti"));
        s1.display();
        System.out.println("Deleted element is "+s1.pop());
    }
    
}
