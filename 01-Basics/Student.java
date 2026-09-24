import java.util.Scanner;
class StudentSort{
    int id;
    String name;
    double per;
    StudentSort(int id, String name, double per){
        this. id = id;
         this.name= name;
         this. per = per;
    }

}
public class Student{
     public static void main(String[] args) {
        StudentSort[] stud = new StudentSort[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5 ;i++){
            System.out.println("Enter id , name, percentage of the student: "+(i+1));
            int id = sc.nextInt();
            String name = sc.next();
            double per = sc.nextDouble();
            stud[i] = new StudentSort(id,name,per);
        }
        for(int i = 0 ; i<stud.length-1;i++){
            for(int j = 0;j<stud.length-1-i;j++){
                if(stud[i].per>stud[j+1].per){
                    StudentSort temp = stud[j];
                    stud[j]= stud[j+1];
                    stud[j+1]=temp;
                }
            }
        }
        sc.close();
        System.out.println("Sorted by percentage: ");
        for(StudentSort s : stud){
            System.out.println(s.id+" "+s.name+" "+s.per);
        }
     }
}
