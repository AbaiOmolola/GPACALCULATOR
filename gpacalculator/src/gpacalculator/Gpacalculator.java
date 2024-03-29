/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gpacalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Gpacalculator {

    /**
     * @param args the command line arguments
     */
    public String ourGrade(double score){
        String grade = "";
        if (score >=  70 && score <= 100){
            grade = "A";
        } else if (score >= 60 && score <= 69){
            grade = "B";
        } else if (score >= 50 && score <= 59){
            grade = "C";
        } else if (score >= 45 && score <= 49){
            grade = "D";
        } else if (score >= 40 && score <= 44){
            grade = "E";
        } else  {
            grade = "F";
        }
        return grade;
    }
    
    public int getPoint(String grade){
        int point = 0;
        switch(grade){
            case  "A" -> point = 5;
            case "B" -> point = 4;
            case "C" -> point = 3;
            case "D" -> point = 2;
            case "E" -> point = 1;
            case "F" -> point = 0;
        }
        return point;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("GPA CALCULATOR");
        
        Scanner i = new Scanner(System.in);
        
        //COURSE 1 DETAILS
        System.out.println("ENTER COURSE 1: ");
        String course1 = i.nextLine();
        
        System.out.println("Enter " + course1 + " grade: ");
        int gradeUnit1 = i.nextInt();
        
        System.out.println("Enter " + course1 + " score: ");
        double score1 = i.nextDouble();
        
        i.nextLine();
        
        //COURSE 2 DETAILS
        
        System.out.println("ENTER COURSE 2: ");
        String course2 = i.nextLine();
        
        System.out.println("Enter " + course2 + " grade: ");
        int gradeUnit2 = i.nextInt();
        
        System.out.println("Enter " + course2 + " score: ");
        double score2 = i.nextDouble();
        
        i.nextLine();
       
        
        //COURSE 3 DETAILS
        
        System.out.println("ENTER COURSE 3: ");
        String course3 = i.nextLine();
        
        System.out.println("Enter " + course3 + " grade: ");
        int gradeUnit3 = i.nextInt();
        
        System.out.println("Enter " + course3 + " score: ");
        double score3 = i.nextDouble();
        
        i.nextLine();
        
        //COURSE 4 DETAILS
        
        System.out.println("ENTER COURSE 4: ");
        String course4 = i.nextLine();
        
        System.out.println("Enter " + course4 + " grade: ");
        int gradeUnit4 = i.nextInt();
        
        System.out.println("Enter " + course4 + " score: ");
        double score4 = i.nextDouble();
        
        i.nextLine();
        
        //COURSE 5 DETAILS
        
        System.out.println("ENTER COURSE 5: ");
        String course5 = i.nextLine();
        
        System.out.println("Enter " + course5 + " grade: ");
        int gradeUnit5 = i.nextInt();
        
        System.out.println("Enter " + course5 + " score: ");
        double score5 = i.nextDouble();
        
        i.nextLine();
        
        Gpacalculator st  = new  Gpacalculator();
        
        String grade1 = st.ourGrade(score1);
        String grade2 = st.ourGrade(score2);
        String grade3 = st.ourGrade(score3);
        String grade4 = st.ourGrade(score4);
        String grade5 = st.ourGrade(score5);
        
        
        int point1 = st.getPoint(grade1);
        int point2 = st.getPoint(grade2);
        int point3 = st.getPoint(grade3);
        int point4 = st.getPoint(grade4);
        int point5 = st.getPoint(grade5);
        
        
        int totalGradeUnit  = gradeUnit1 +  gradeUnit2 + gradeUnit3 + gradeUnit4 + gradeUnit5;
        
        
        double quality1 = (point1  * gradeUnit1);
        double quality2 = (point2  * gradeUnit2);
        double quality3 = (point3  * gradeUnit3);
        double quality4 = (point4  * gradeUnit4);
        double quality5 = (point5  * gradeUnit5);
        
        double qualityPoint = quality1 + quality2 + quality3 + quality4 + quality5;
       
        
        double gpa = qualityPoint/totalGradeUnit;
        
        DecimalFormat df = new DecimalFormat ("0.00");
        
        System.out.println("|-----------------------|-------------|-------|------------|");
        System.out.println("|      COURSE CODE      | COURSE UNIT | GRADE | GRADE UNIT |");
        System.out.println("|-----------------------|-------------|-------|------------|");
        System.out.format("| %-19s   |%-13d|%-7s| %-10d |\n", course1, gradeUnit1, grade1, point1);  
        System.out.format("| %-19s   |%-13d|%-7s| %-10d |\n", course2, gradeUnit2, grade2, point2);  
        System.out.format("| %-19s   |%-13d|%-7s| %-10d |\n", course3, gradeUnit3, grade3, point3);  
        System.out.format("| %-19s   |%-13d|%-7s| %-10d |\n", course4, gradeUnit4, grade4, point4);  
        System.out.format("| %-19s   |%-13d|%-7s| %-10d |\n", course5, gradeUnit5, grade5, point5);  
        System.out.println("|----------------------------------------------------------|");
       
        System.out.println(" \nYour GPA is =  " + df.format(gpa) + " to 2 decimal place");
       
        
        
        //END NOW  GET TABLES
        
       
        
    }
    
}
