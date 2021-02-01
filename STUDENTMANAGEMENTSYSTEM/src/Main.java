import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        //Ask how many students are in the system
        Scanner in = new Scanner(System.in);
        System.out.println("How many students do you want to input into the system? ");
        int NumOfStudents = in.nextInt();

        Student array[] = new Student[NumOfStudents];

        //Create n the new students

        for(int i = 0; i < NumOfStudents; i++){
            Student student = new Student();
            student.enroll();
            student.showPayment();
            System.out.println(student.toString());

        }
    }
}
