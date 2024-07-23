package Ex_20072024;

import java.util.Scanner;

public class Lab016_Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        if (num1 > num2)
        {
            System.out.println(+num1+" is the max value");
        }
        else if (num1 == num2)
        {
            System.out.println("Both are equal numbers");
        }
        else
        {
            System.out.println(+num2+ " is the max value");
        }
    }
}
