
public class Student_Grade_Calculator {

    private int percentage;
    private int totalMarks;
    private String grade;
    private int sub;

    public int getPercentage() {
        return percentage;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public String getGrade() {
        return grade;
    }

    public int total_Mark(int[] marks){

        for(int i=0;i<marks.length;i++){
            int m=marks[i];
            totalMarks+=m;
        }
        return totalMarks;
    }

    public int percentage(int totalMarks){

        percentage=totalMarks/5;
        return percentage;
    }
    public String calculation(int percentage){

        if(percentage>=90){
            grade="A";
        }
        else if(percentage>=80){
            grade="B";
        }
        else if(percentage>=60){
            grade="C";
        }
        else if(percentage>=35){
            grade="D";
        }
        else{
            grade="Fail";
        }
        return grade;
    }
}

