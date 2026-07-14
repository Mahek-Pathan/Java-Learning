class compile {
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
public class poly{
    public static void main(String[] args) {
        compile c = new compile();
        c.add(2, 20);
        c.add(2,3,4);
    }
}

