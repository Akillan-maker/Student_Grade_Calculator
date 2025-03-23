import java.util.Scanner;

public class Student_Main {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Student_Grade_Calculator obj=new Student_Grade_Calculator();

        System.out.println("**** Enter the Student marks ****");

        System.out.println("Enter number of subjects: ");
        int sub=scanner.nextInt();
        int[] marks =new int[sub];
        for(int i=1;i<=sub;i++){
            System.out.print("Enter mark of subject "+i+": ");
            int mark=scanner.nextInt();
            marks[i-1]=mark;
        }

        obj.total_Mark(marks);
        obj.percentage(obj.getTotalMarks());
        obj.calculation(obj.getPercentage());

        System.out.println("*** Grade for subjects ***");
        for(int j=1;j<=marks.length;j++){
            int temp=marks[j-1];
            System.out.println("Subject "+j+": "+obj.calculation(temp));
        }

        System.out.println("**** Student's Score ****");
        System.out.println("Student Total: "+obj.getTotalMarks());
        System.out.println("Student Percentage: "+obj.getPercentage());
        System.out.println("Student Grade: "+obj.getGrade());

    }
}
