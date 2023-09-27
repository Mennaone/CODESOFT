
package student.grade.calculator;
import java.util.*;

public class StudentGradeCalculator {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float [] marks = new float[6];
      float avg, total =0;
      char grade;
        System.out.println("enter the marks for teh 6 subjects: ");
        for (int i=0; i < marks.length; i++){
            marks[i] = input.nextFloat();
            total += marks[i];
        }
        avg = (total / 6 );
        if (avg >=95 && avg <=100){
            grade = 'A';
        }else if (avg >= 85 && avg < 95){
            grade = 'B';
        }else if (avg >=75 && avg < 85){
            grade = 'C';
        }else if (avg >= 65 && avg < 75){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("Total Marks = " + total+ " Percentage = "+ avg + " Grade = "+grade);
    }
    
}
