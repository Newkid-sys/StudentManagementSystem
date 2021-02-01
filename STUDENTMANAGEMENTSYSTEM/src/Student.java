import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
    private static int courseCost = 600;
    private static int id = 1000; //Static helps keeping the

    //Prompt user to enter student's name and year

    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = input.nextLine();
        System.out.println("Enter student's last name: ");
        this.lastName = input.nextLine();
        System.out.println("Enter student's year:\n1 - Freshman \n2 - Sopohmore \n3 - Junior\n4 - Senior ");
        this.year = input.nextInt();

        setStudentID();
        //System.out.println(firstName + ' ' + lastName + " ID: " +studentID);
        //showStudent();

    }


    //Generate an ID
    //Private is used interanlly and provent access from outside control
    private void setStudentID(){
        id++;
        this.studentID = year+""+id;
    }

    //Enroll in courses

    public void enroll(){
        //Get inside a loop, user exits hits 0

        do{
            System.out.println("Enter course to enroll (Quit to exit)");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            //String choice = input.nextLine();
            if (!course.equals("Quit")){
                courses = courses +"\n"+ course;
                tuitionBalance = tuitionBalance + courseCost;
                System.out.println("Courses: \n" + courses+"\n");
            } else{
                System.out.println("Exit");
                break;
            }
        }while(1 != 0);

        //System.out.println("Tuition Balance is "+tuitionBalance)
    }



    //View balance and pay tuition

    public void showBalance(){
        System.out.println("Tuition Balance is "+tuitionBalance);
    }

    //Pay tuition
    public void showPayment(){
        Scanner pay = new Scanner(System.in);
        System.out.println("How much do you want to pay for now? ");
        int payment = pay.nextInt();
        tuitionBalance -= payment;
        System.out.println("Paid: $"+payment+"\nBalance: $"+tuitionBalance);
    }

    //Show status of student
    public String toString(){
        return "First Name: "+firstName+"\nLast Name:"+lastName+
                "\nCourse year: "+year+"\nStudent ID: "+studentID+
                "\nCourses Enrolled: "+courses+"\nBalance: "+tuitionBalance;
    }

}
