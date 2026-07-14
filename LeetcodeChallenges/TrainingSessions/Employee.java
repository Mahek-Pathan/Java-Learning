import java.util.ArrayList;

class Emp{
    String name,position,empid;
    int salary;

    Emp(String name,String empid,int salary,String position){
        this.name=name;
        this.empid=empid;
        this.salary=salary;
        this.position=position;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id"+empid);
        System.out.println("Salary: "+salary);
        System.out.println("Position"+position);
        }
}

class Manager extends Emp{
    ArrayList<Emp> emp = new ArrayList<>();
    Manager(String name,String empid, int salary,String position){
        super(name, empid, salary, position);
    }
    public void addEmp(Emp e){
        emp.add(e);
    }
    public void displayElements(){
        if(emp.isEmpty()){
            System.out.println("No Employee under supervision");
     
        }
        else{
            for(Emp i: emp){
                i.displayDetails();
            }
        }
    }
}
public class Employee {
    public static void main(String[] args)
    {
        Emp e1 = new Emp("ABC","11",80000,"SDE");
        e1.displayDetails();
    }
    
}
