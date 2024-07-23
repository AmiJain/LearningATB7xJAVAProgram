package Ex_20072024;

import java.util.Scanner;

public class Lab017_Loops {
    public static void main(String[] args) {
        //Grade calculator using the if else loop.
        //A: 90-100 ; B:80-89 ; C:70-79 ; D:60-69 ; F:0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        double marks = sc.nextDouble();
        char grade = 0;
        if (marks >= 90 && marks <= 100)
        {
            grade = 'A';
        }
        else if (marks >= 80 && marks <= 89)
        {
            grade = 'B';
        }
        else if (marks >= 70 && marks <= 79)
        {
            grade = 'C';
        }
        else if (marks >= 60 && marks <= 69)
        {
            grade = 'D';
        }
        else if (marks >= 0 && marks <= 59)
        {
            grade = 'F';
        }
        else
        {
            System.out.println("Enter the valid marks obtained");
        }
        System.out.println("Your grade is " +grade);
    }
}
