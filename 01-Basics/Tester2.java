public class Tester2 {
    public static void main(String[] args) {
        DLL l = new DLL();
        l.insert("Seeta",4);
        l.insert("Geeta",6);
        System.out.println("Lineked List: ");
        l.print();
        System.out.println("\nReverse Linked List\n: ");
        l.printFront();
        l.insert("Amol", 2);
        l.insert("Aisha", 4);
        l.insert("Ajit", 5);
        l.insert("Amitabh", 1);
        System.out.println("Linked  List\n");
        l.print();
        System.out.println("\nReversed Linked List:");
        l.printFront();

    }
}
