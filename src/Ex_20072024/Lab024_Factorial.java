package Ex_20072024;

import java.util.Scanner;

public class Lab024_Factorial {
    public static void main(String[] args) {

        // Find the factorial of the number entered by the user..
        // Take the user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int user_input = sc.nextInt();
        //Logic::::

        for(int i = user_input-1; i>=1;i--)
        {
            user_input = user_input * i;
        }
       System.out.println("The factorial of the number is: " +user_input);

//        int i = user_input -1;
//        while (i>=1)
//        {
//            user_input = user_input * i;
//            i--;
//
//        }
//        System.out.println("The factorial of the number is" +user_input);
    }
}
